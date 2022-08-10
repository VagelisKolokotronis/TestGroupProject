package com.example.testgroupproject.Models;

import javax.persistence.*;

@Entity
@Table(name = "producer_products")
public class ProducerProduct {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EmbeddedId
    private ProducerProductId id;

    @MapsId("fkProdId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FK_prod_ID", nullable = false)
    private Producer fkProd;

    public ProducerProductId getId() {
        return id;
    }

    public void setId(ProducerProductId id) {
        this.id = id;
    }

    public Producer getFkProd() {
        return fkProd;
    }

    public void setFkProd(Producer fkProd) {
        this.fkProd = fkProd;
    }

}