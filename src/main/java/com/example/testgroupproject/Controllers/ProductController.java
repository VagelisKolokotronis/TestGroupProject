package com.example.testgroupproject.Controllers;

import com.example.testgroupproject.Models.Product;
import com.example.testgroupproject.Services.ProdServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
//@RequestMapping("/product")
public class ProductController {

    //Injecting Interface methods from Service via ImpProductService (@Autowired)
    @Autowired
    ProdServiceInterface prodService;

    // Url Mapping and Requesting the parameters from the View
    @PostMapping("/insert")
    public String insertProduct(@RequestParam("productName") String productName,
                                @RequestParam("productPrice") Double productPrice,
                                ModelMap mm){

        Product product = new Product(productName, productPrice);
        prodService.insertProduct(product);
        List<Product> allProducts = prodService.getAllProducts();
        mm.addAttribute("allProducts", allProducts);
        return "ProductForm";
    }
}
