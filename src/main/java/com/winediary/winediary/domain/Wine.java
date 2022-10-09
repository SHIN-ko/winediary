package com.winediary.winediary.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Wine extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name = "wine_no")
    private Long sn;

    @Column
    private String wineCode;

    @Column
    private String wineName;

    @Column
    private String wineCategory;

    @Column
    private String wineCountry;

    @Column
    private String wineVintage;
}
