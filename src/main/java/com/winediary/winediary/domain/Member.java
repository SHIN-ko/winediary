package com.winediary.winediary.domain;

import org.springframework.context.annotation.Configuration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Member extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name = "member_no")
    private Long sn;

    @Column
    private String email;

    @Column
    private String nickName;

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

    @Column
    private LocalDateTime lastLoginDateTime;
}
