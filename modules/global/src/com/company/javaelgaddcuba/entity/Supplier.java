package com.company.javaelgaddcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIdentityIdEntity;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.global.DdlGeneration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.CREATE_ONLY)
@Table(name = "supplier")
@Entity(name = "javaelgaddcuba_Supplier")
@NamePattern("%s|name")
public class Supplier extends BaseIdentityIdEntity {
    private static final long serialVersionUID = -2102253780048013634L;
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}