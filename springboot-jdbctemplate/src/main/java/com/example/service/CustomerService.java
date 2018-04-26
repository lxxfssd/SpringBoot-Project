package com.example.service;

import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    public void addCustomer(String name, Integer password);
}
