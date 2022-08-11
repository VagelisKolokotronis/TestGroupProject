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
    @PostMapping("/insertProduct")
    public String insertProduct(@RequestParam("productName") String productName,
                                @RequestParam("productPrice") Double productPrice,
                                ModelMap mm){
        //Invokes constructor and creates new obj, then calls Interface from Services and implements the method insertProduct from impProductService
        Product product = new Product(productName, productPrice);
        prodService.insertProduct(product);

        //Stores the value of the method getAllProducts into "products" and send it to the html page assigned to 'return'.
        mm.addAttribute("products", prodService.getAllProducts());
        return "productList";
    }
}
