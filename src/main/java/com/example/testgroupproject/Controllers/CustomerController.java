package com.example.testgroupproject.Controllers;

import com.example.testgroupproject.Models.CustomerGuest;
import com.example.testgroupproject.Models.Product;
import com.example.testgroupproject.Services.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CustomerController {

    //Injecting Interface methods from Service via ImpCustomerService (@Autowired)
    @Autowired
    CustomerServiceInterface customerService;

    //
    @PostMapping("/insertCustomer")
    public String insertCustomer(@RequestParam("cusName") String cusName,
                                @RequestParam("cusLName") String cusLName,
                                @RequestParam("cusEmail") String cusEmail,
                                @RequestParam("cusPhone") Integer cusPhone,
                                @RequestParam("cusPC") Integer cusPC,
                                @RequestParam("cusStreet") String cusStreet,
                                @RequestParam("cusStreetNr") Integer cusStreetNr,
                                ModelMap mm){

        //Invokes constructor and creates new obj, then calls Interface from Services and implements the method insertCustomer from impCustomerService
        CustomerGuest customer = new CustomerGuest(cusName, cusLName, cusEmail, cusPhone, cusPC, cusStreet, cusStreetNr);
        customerService.insertCustomer(customer);
        //Stores the value of the method getAllCustomers into "customers" and send it to the html page assigned to 'return'.
        mm.addAttribute("customers", customerService.getAllCustomers());
        return "CustomerList";
    }
}
