package com.winediary.winediary.domain;

import javax.persistence.*;

@Entity
public class Comment extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "comment_no")
    private Long sn;

    @ManyToOne(
           fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "board_no",
            nullable = false
    )
    private Board board;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "member_no",
            nullable = false
    )
    private Member member;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "parent_sn",
            nullable = false
    )
    private Comment comment;

    @Column
    private String contents;

}
