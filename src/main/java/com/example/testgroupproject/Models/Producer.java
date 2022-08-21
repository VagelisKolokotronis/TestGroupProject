package com.example.testgroupproject.Models;

import javax.persistence.*;

@Entity
@Table(name = "producer")
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_ID", nullable = false)
    private Integer id;

    @Column(name = "prod_FName", length = 45)
    private String prodFname;

    @Column(name = "prod_LName", length = 45)
    private String prodLname;

    @Column(name = "prod_Address", length = 45)
    private String prodAddress;

    @Column(name = "prod_Area", length = 45)
    private String prodArea;

    @Column(name = "prod_Email", length = 45)
    private String prodEmail;

    @Column(name = "prod_IBAN", length = 20)
    private String prodIban;

    @Column(name = "prod_Bus_Title", length = 45)
    private String prodBusTitle;

    public Producer(String prodFname, String prodLname, String prodAddress, String prodArea, String prodEmail, String prodIban, String prodBusTitle) {
        this.prodFname = prodFname;
        this.prodLname = prodLname;
        this.prodAddress = prodAddress;
        this.prodArea = prodArea;
        this.prodEmail = prodEmail;
        this.prodIban = prodIban;
        this.prodBusTitle = prodBusTitle;
    }

    public Producer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdFname() {
        return prodFname;
    }

    public void setProdFname(String prodFname) {
        this.prodFname = prodFname;
    }

    public String getProdLname() {
        return prodLname;
    }

    public void setProdLname(String prodLname) {
        this.prodLname = prodLname;
    }

    public String getProdAddress() {
        return prodAddress;
    }

    public void setProdAddress(String prodAddress) {
        this.prodAddress = prodAddress;
    }

    public String getProdArea() {
        return prodArea;
    }

    public void setProdArea(String prodArea) {
        this.prodArea = prodArea;
    }

    public String getProdEmail() {
        return prodEmail;
    }

    public void setProdEmail(String prodEmail) {
        this.prodEmail = prodEmail;
    }

    public String getProdIban() {
        return prodIban;
    }

    public void setProdIban(String prodIban) {
        this.prodIban = prodIban;
    }

    public String getProdBusTitle() {
        return prodBusTitle;
    }

    public void setProdBusTitle(String prodBusTitle) {
        this.prodBusTitle = prodBusTitle;
    }

}