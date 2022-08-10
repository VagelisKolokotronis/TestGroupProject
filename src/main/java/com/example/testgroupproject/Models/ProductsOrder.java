package com.example.testgroupproject.Models;

import javax.persistence.*;

@Entity
@Table(name = "products_order")
public class ProductsOrder {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EmbeddedId
    private ProductsOrderId id;

    @Column(name = "product_Qty")
    private Integer productQty;

    @Column(name = "total_price")
    private Double totalPrice;

    public ProductsOrderId getId() {
        return id;
    }

    public void setId(ProductsOrderId id) {
        this.id = id;
    }

    public Integer getProductQty() {
        return productQty;
    }

    public void setProductQty(Integer productQty) {
        this.productQty = productQty;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

}