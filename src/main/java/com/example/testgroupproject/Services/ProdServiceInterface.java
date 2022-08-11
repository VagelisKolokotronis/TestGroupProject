package com.example.testgroupproject.Services;

import com.example.testgroupproject.Models.Product;

import java.util.List;

public interface ProdServiceInterface {
    void insertProduct(Product p);

    List<Product> getAllProducts();
}
