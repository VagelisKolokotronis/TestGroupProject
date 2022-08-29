package com.example.testgroupproject.Services.ProductService;

import com.example.testgroupproject.Models.Product;


import java.util.List;

public interface ProdServiceInterface {
    void insertProduct(Product p);

    List<Product> getAllProducts();

    Product getProductById(Integer id);

    void deleteProduct(Product p);

    void updateProduct(Product p);


}
