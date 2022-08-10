package com.example.testgroupproject.Models;

import javax.persistence.*;

@Entity
@Table(name = "customer_member")
public class CustomerMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FK_cus_member_ID", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FK_cus_member_ID", nullable = false)
    private CustomerGuest customerGuest;

    @Column(name = "username", nullable = false, length = 45)
    private String username;

    @Column(name = "password", nullable = false, length = 45)
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CustomerGuest getCustomerGuest() {
        return customerGuest;
    }

    public void setCustomerGuest(CustomerGuest customerGuest) {
        this.customerGuest = customerGuest;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}