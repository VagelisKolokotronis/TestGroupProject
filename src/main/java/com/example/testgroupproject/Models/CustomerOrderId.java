package com.example.testgroupproject.Models;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CustomerOrderId implements Serializable {
    private static final long serialVersionUID = 7774491409733132487L;
    @Column(name = "FK_cus_ID", nullable = false)
    private Integer fkCusId;

    @Column(name = "FK_order_ID", nullable = false)
    private Integer fkOrderId;

    public Integer getFkCusId() {
        return fkCusId;
    }

    public void setFkCusId(Integer fkCusId) {
        this.fkCusId = fkCusId;
    }

    public Integer getFkOrderId() {
        return fkOrderId;
    }

    public void setFkOrderId(Integer fkOrderId) {
        this.fkOrderId = fkOrderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CustomerOrderId entity = (CustomerOrderId) o;
        return Objects.equals(this.fkOrderId, entity.fkOrderId) &&
                Objects.equals(this.fkCusId, entity.fkCusId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fkOrderId, fkCusId);
    }

}