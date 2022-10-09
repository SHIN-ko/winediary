package com.winediary.winediary.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {
    @Id
    @Column
    private Long sn;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String sex;

    @Column
    private String telNo;

    @Column
    private String age;

}
