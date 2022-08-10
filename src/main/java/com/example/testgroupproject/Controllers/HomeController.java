package com.example.testgroupproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Main Page Controller
@Controller
public class HomeController {

    @GetMapping("/")
    public String ShowHome() {

        return("home");
    }
}
