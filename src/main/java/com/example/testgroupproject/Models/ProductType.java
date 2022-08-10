package com.example.testgroupproject.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_type")
public class ProductType {
    @Id
    @Column(name = "FK_prod_type_ID", nullable = false)
    private Integer id;

    @Column(name = "prod_type_name", length = 45)
    private String prodTypeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdTypeName() {
        return prodTypeName;
    }

    public void setProdTypeName(String prodTypeName) {
        this.prodTypeName = prodTypeName;
    }

}