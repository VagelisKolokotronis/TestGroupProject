package com.example.testgroupproject.Models;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProducerProductId implements Serializable {
    private static final long serialVersionUID = 315761986741234171L;
    @Column(name = "FK_prod_ID", nullable = false)
    private Integer fkProdId;

    @Column(name = "FK_product_ID", nullable = false)
    private Integer fkProductId;

    public Integer getFkProdId() {
        return fkProdId;
    }

    public void setFkProdId(Integer fkProdId) {
        this.fkProdId = fkProdId;
    }

    public Integer getFkProductId() {
        return fkProductId;
    }

    public void setFkProductId(Integer fkProductId) {
        this.fkProductId = fkProductId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProducerProductId entity = (ProducerProductId) o;
        return Objects.equals(this.fkProductId, entity.fkProductId) &&
                Objects.equals(this.fkProdId, entity.fkProdId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fkProductId, fkProdId);
    }

}