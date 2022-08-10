package com.example.testgroupproject.Models;

import javax.persistence.*;

@Entity
@Table(name = "customer_order")
public class CustomerOrder {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EmbeddedId
    private CustomerOrderId id;

    @MapsId("fkCusId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FK_cus_ID", nullable = false)
    private CustomerGuest fkCus;

    @Column(name = "cus_order")
    private Integer cusOrder;

    public CustomerOrderId getId() {
        return id;
    }

    public void setId(CustomerOrderId id) {
        this.id = id;
    }

    public CustomerGuest getFkCus() {
        return fkCus;
    }

    public void setFkCus(CustomerGuest fkCus) {
        this.fkCus = fkCus;
    }

    public Integer getCusOrder() {
        return cusOrder;
    }

    public void setCusOrder(Integer cusOrder) {
        this.cusOrder = cusOrder;
    }

}