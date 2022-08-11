package com.example.testgroupproject.Services;

import com.example.testgroupproject.Models.CustomerGuest;
import com.example.testgroupproject.Models.Product;
import com.example.testgroupproject.Repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpCustomerService implements CustomerServiceInterface{

    //Injecting The repository for the Entity CustomerGuest which extends JpaRepository with build in Methods via the Interface from Services
    @Autowired
    CustomerRepo customerRepo;

    @Override
    public void insertCustomer(CustomerGuest c) {
        CustomerGuest savedCustomer = customerRepo.save(c);
    }

    @Override
    public List<CustomerGuest> getAllCustomers() {
        return customerRepo.findAll();
    }


}
