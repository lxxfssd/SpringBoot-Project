package com.example.controller;

import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/addCustomer")
    public String addCustomer(@RequestParam(value = "name") String name, @RequestParam(value = "password") Integer password) {
        customerService.addCustomer(name, password);
        return "add success!";
    }
}
