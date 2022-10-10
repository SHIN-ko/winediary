package com.winediary.winediary.domain;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class Member extends BaseEntity implements UserDetails {
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

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> memberRoles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.memberRoles.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
