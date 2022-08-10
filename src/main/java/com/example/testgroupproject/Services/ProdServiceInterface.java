package com.example.testgroupproject.Services;

import com.example.testgroupproject.Models.Product;

import java.util.List;

public interface ProdServiceInterface {
    public void insertProduct(Product p);

    public List<Product> getAllProducts();
}
