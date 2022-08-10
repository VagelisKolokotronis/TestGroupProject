package com.example.testgroupproject.Models;

import javax.persistence.*;

@Entity
@Table(name = "customer_guest")
public class CustomerGuest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cus_ID", nullable = false)
    private Integer id;

    @Column(name = "cus_FName", length = 45)
    private String cusFname;

    @Column(name = "cus_LName", length = 45)
    private String cusLname;

    @Column(name = "cus_email", length = 45)
    private String cusEmail;

    @Column(name = "cus_phoneNr")
    private Integer cusPhonenr;

    @Column(name = "cus_PostalC")
    private Integer cusPostalc;

    @Column(name = "cus_Street", length = 45)
    private String cusStreet;

    @Column(name = "cus_StreetNr")
    private Integer cusStreetnr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCusFname() {
        return cusFname;
    }

    public void setCusFname(String cusFname) {
        this.cusFname = cusFname;
    }

    public String getCusLname() {
        return cusLname;
    }

    public void setCusLname(String cusLname) {
        this.cusLname = cusLname;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public Integer getCusPhonenr() {
        return cusPhonenr;
    }

    public void setCusPhonenr(Integer cusPhonenr) {
        this.cusPhonenr = cusPhonenr;
    }

    public Integer getCusPostalc() {
        return cusPostalc;
    }

    public void setCusPostalc(Integer cusPostalc) {
        this.cusPostalc = cusPostalc;
    }

    public String getCusStreet() {
        return cusStreet;
    }

    public void setCusStreet(String cusStreet) {
        this.cusStreet = cusStreet;
    }

    public Integer getCusStreetnr() {
        return cusStreetnr;
    }

    public void setCusStreetnr(Integer cusStreetnr) {
        this.cusStreetnr = cusStreetnr;
    }

}