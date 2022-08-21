package com.example.testgroupproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//Main Page Controller
@Controller
public class HomeController {

    @GetMapping("/")
    public String showHome() {

        return("home");
    }

    @PostMapping("/sendToProduct")
    public String redirectToProduct() {

        return ("ProductForm");
    }

    @PostMapping("/sendToCustomer")
    public String redirectToCustomer() {

        return ("CustomerForm");
    }

    @PostMapping("/sendToOrder")
    public String redirectToOrder() {

        return ("OrderForm");
    }

    @PostMapping("/sendToProducer")
    public String redirectToProducer(){

        return ("ProducerForm");
    }


}
