package com.example.testgroupproject.Services;

import com.example.testgroupproject.Models.Product;
import com.example.testgroupproject.Repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpProductService implements ProdServiceInterface {

    //Injecting The repository for the Entity Product which extends JpaRepository with build in Methods via the Interface from Services
    @Autowired
    ProductRepo productRepo;

    @Override
    public void insertProduct(Product p) {
        Product savedProduct = productRepo.save(p);
    }

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }
}
