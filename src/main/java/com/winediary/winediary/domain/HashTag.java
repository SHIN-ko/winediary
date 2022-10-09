package com.winediary.winediary.domain;

import javax.persistence.*;

@Entity
public class HashTag {
    @Id
    @GeneratedValue
    @Column(name = "tag_no")
    private Long sn;

    @Column
    private String hashTagName;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "wineDiary_no",
            nullable = false
    )
    private WineDiary wineDiary;
}
