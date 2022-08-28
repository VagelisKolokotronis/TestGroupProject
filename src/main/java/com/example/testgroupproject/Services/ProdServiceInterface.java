package com.example.testgroupproject.Services;

import com.example.testgroupproject.Models.Product;


import java.util.List;

public interface ProdServiceInterface {
    void insertProduct(Product p);

    List<Product> getAllProducts();

    Product getProductById(Integer id);

    void deleteProduct(Product p);

    void updateProduct(Product p);

  //  void updateProduct(Integer id, String productName, Double productPrice, String productInfo, Double possibleDiscount);

}
