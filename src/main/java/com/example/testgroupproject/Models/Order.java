package com.example.testgroupproject.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_ID", nullable = false)
    private Integer id;

    @Column(name = "payment_type", length = 45)
    private String paymentType;

    @Column(name = "shipment_info")
    private Integer shipmentInfo;

    @Column(name = "order_date")
    private Date orderDate;

    public Order(String paymentType, Integer shipmentInfo, Date orderDate) {
        this.paymentType = paymentType;
        this.shipmentInfo = shipmentInfo;
        this.orderDate = orderDate;
    }

    public Order() {

    }

    public Order(String paymentType) {
        this.paymentType = paymentType;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getShipmentInfo() {
        return shipmentInfo;
    }

    public void setShipmentInfo(Integer shipmentInfo) {
        this.shipmentInfo = shipmentInfo;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

}