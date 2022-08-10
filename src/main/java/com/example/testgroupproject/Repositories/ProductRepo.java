package com.example.testgroupproject.Repositories;


import com.example.testgroupproject.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {


//    List<Product> findByProductName(String productName);
//
//    List<Product> findByProductPrice(double productPrice);
}
