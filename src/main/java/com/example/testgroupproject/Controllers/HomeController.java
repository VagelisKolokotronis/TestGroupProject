package com.example.testgroupproject.Controllers;

import com.example.testgroupproject.Services.CustomerService.CustomerServiceInterface;
import com.example.testgroupproject.Services.OrderService.OrderServiceInterface;
import com.example.testgroupproject.Services.ProductService.ProdServiceInterface;
import com.example.testgroupproject.Services.ProducerService.ProducerServiceInterface;
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

    @PostMapping("/")
    public String redirectToHome() {

        return("/home");
    }

    @PostMapping("/sendToProduct")
    public String redirectToProduct() {

        return ("Product/ProductForm");
    }

    @PostMapping("/sendToCustomer")
    public String redirectToCustomer() {

        return ("Customer/CustomerForm");
    }

    @PostMapping("/sendToOrder")
    public String redirectToOrder() {

        return ("Order/OrderForm");
    }

    @PostMapping("/sendToProducer")
    public String redirectToProducer(){

        return ("Producer/ProducerForm");
    }

    @PostMapping("/sendToProductList")
    public String redirectToProductList(ModelMap mm){

        mm.addAttribute("products", prodService.getAllProducts());

        return ("Product/ProductList");
    }

    @PostMapping("/sendToOrderList")
    public String redirectToOrderList(ModelMap mm) {

        mm.addAttribute("orders", orderService.getAllOrders());

        return ("Order/OrderList");
    }

    @PostMapping("/sendToCustomerList")
    public String redirectToCustomerList(ModelMap mm) {

        mm.addAttribute("customers", customerService.getAllCustomers());
        return ("Customer/CustomerList");
    }

    @PostMapping("/sendToProducerList")
    public String redirectToProducerList(ModelMap mm) {

        mm.addAttribute("producers", producerService.getAllProducers());
        return "Producer/ProducerList";
    }


}
