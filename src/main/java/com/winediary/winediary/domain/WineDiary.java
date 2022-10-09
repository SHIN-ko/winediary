package com.winediary.winediary.domain;

import com.fasterxml.jackson.databind.ser.Serializers;

import javax.persistence.*;

@Entity
public class WineDiary extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "wineDiary_no")
    private Long sn;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "member_no",
            nullable = false
    )
    private Member member;

    @Column
    private String wineDiaryTitle;

    @Column
    private String wineName;

    @Column
    //Todo: EnumType 으로 관리 수정
    private String category;

    @Column
    private String country;



}
