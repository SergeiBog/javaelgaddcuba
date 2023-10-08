package com.company.javaelgaddcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIdentityIdEntity;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.global.DdlGeneration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.CREATE_ONLY)
@Table(name = "customer")
@Entity(name = "javaelgaddcuba_Customer")
@NamePattern("%s|name")
public class Customer extends BaseIdentityIdEntity {
    private static final long serialVersionUID = -210420707736475825L;
    @Column(name = "city", nullable = false, length = 100)
    private String city;
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}