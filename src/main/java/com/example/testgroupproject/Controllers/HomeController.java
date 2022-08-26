package com.example.testgroupproject.Controllers;

import com.example.testgroupproject.Services.CustomerServiceInterface;
import com.example.testgroupproject.Services.OrderServiceInterface;
import com.example.testgroupproject.Services.ProdServiceInterface;
import com.example.testgroupproject.Services.ProducerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//Main Page Controller
@Controller
public class HomeController {
    @Autowired
    ProdServiceInterface prodService;
    @Autowired
    OrderServiceInterface orderService;
    @Autowired
    CustomerServiceInterface customerService;
    @Autowired
    ProducerServiceInterface producerService;

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

    @PostMapping("/sendToProductList")
    public String redirectToProductList(ModelMap mm){

        mm.addAttribute("products", prodService.getAllProducts());

        return ("productList");
    }

    @PostMapping("/sendToOrderList")
    public String redirectToOrderList(ModelMap mm) {

        mm.addAttribute("orders", orderService.getAllOrders());

        return ("OrderList");
    }

    @PostMapping("/sendToCustomerList")
    public String redirectToCustomerList(ModelMap mm) {

        mm.addAttribute("customers", customerService.getAllCustomers());
        return ("CustomerList");
    }

    @PostMapping("/sendToProducerList")
    public String redirectToProducerList(ModelMap mm) {

        mm.addAttribute("producers", producerService.getAllProducers());
        return "ProducerList";
    }


}
