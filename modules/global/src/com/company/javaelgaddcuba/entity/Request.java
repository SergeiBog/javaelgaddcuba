package com.company.javaelgaddcuba.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.BaseIdentityIdEntity;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DdlGeneration;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.CREATE_ONLY)
@Table(name = "request")
@Entity(name = "javaelgaddcuba_Request")
public class Request extends BaseIdentityIdEntity {
    private static final long serialVersionUID = 192738416970055317L;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer")
    private com.company.javaelgaddcuba.entity.Customer customer;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "supplier")
    private com.company.javaelgaddcuba.entity.Supplier supplier;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "request")
    private List<RequestItem> requestItems = new ArrayList<>();

    public com.company.javaelgaddcuba.entity.Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(com.company.javaelgaddcuba.entity.Supplier supplier) {
        this.supplier = supplier;
    }

    public com.company.javaelgaddcuba.entity.Customer getCustomer() {
        return customer;
    }

    public void setCustomer(com.company.javaelgaddcuba.entity.Customer customer) {
        this.customer = customer;
    }

    public List<RequestItem> getRequestItems() {
        return requestItems;
    }

    public void setRequestItems(List<RequestItem> requestItems) {
        this.requestItems = requestItems;
    }
}