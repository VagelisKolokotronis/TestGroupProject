package com.example.testgroupproject.Controllers;

import com.example.testgroupproject.Models.Product;
import com.example.testgroupproject.Services.ProdServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    //Injecting Interface methods from Service via ImpProductService (@Autowired)
    @Autowired
    ProdServiceInterface prodService;

    // Url Mapping and Requesting the parameters from the View
    @PostMapping("/insertProduct")
    public String insertProduct(@RequestParam("productName") String productName,
                                @RequestParam("productPrice") Double productPrice,
                                @RequestParam("message") String message,
                                @RequestParam("discount") Double discount,
                                ModelMap mm){

        //Invokes constructor and creates new obj, then calls Interface from Services and implements the method insertProduct from impProductService
        Product product = new Product(productName, productPrice, message, discount);
        prodService.insertProduct(product);

        //Stores the value of the method getAllProducts into "products" and send it to the html page assigned to 'return'.
        mm.addAttribute("products", prodService.getAllProducts());
        return "productList";
    }

    @GetMapping("/edit/{id}")
    public String showUpdatedProductForm(@PathVariable("id") Integer id, ModelMap mm) {

        Product product = prodService.getProductById(id);

        mm.addAttribute("product", product);
        return "UpdateProduct";
    }

    @PostMapping("/update/{id}")
    public String updateProduct(@PathVariable("id") Integer id,
                                @ModelAttribute("product") Product product, BindingResult result,
                                @RequestParam("productName") String productName,
                                @RequestParam("productPrice") Double productPrice,
                                @RequestParam("message") String message,
                                @RequestParam("discount") Double discount) {
        if (result.hasErrors()) {
            product.setId(id);
            return "UpdateProduct";
        }

        prodService.updateProduct(id, productName, productPrice, message, discount);
        return "home";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Integer id, ModelMap mm) {
        Product product = prodService.getProductById(id);

        prodService.deleteProduct(product);
        return "home";
    }
}
