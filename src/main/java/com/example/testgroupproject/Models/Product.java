package com.example.testgroupproject.Models;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_ID", nullable = false)
    private Integer id;

    @Column(name = "product_Name", length = 45)
    private String productName;

    @Column(name = "product_Price")
    private Double productPrice;

    @Lob
    @Column(name = "product_Info")
    private String productInfo;

    @Column(name = "possible_discount")
    private Double possibleDiscount;

    public Product(String productName, Double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public Double getPossibleDiscount() {
        return possibleDiscount;
    }

    public void setPossibleDiscount(Double possibleDiscount) {
        this.possibleDiscount = possibleDiscount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productInfo='" + productInfo + '\'' +
                ", possibleDiscount=" + possibleDiscount +
                '}';
    }
}