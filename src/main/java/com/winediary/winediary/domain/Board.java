package com.winediary.winediary.domain;

import javax.persistence.*;

@Entity
public class Board extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name = "board_no")
    private Long sn;

    @Column
    private String boardTitle;

    @Column
    private String boardContents;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "member_no",
            nullable = false
    )
    private Member member;
}
