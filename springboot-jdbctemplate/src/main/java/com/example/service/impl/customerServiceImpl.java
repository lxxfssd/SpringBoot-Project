package com.example.service.impl;

import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class customerServiceImpl implements CustomerService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addCustomer(String name, Integer password) {
        jdbcTemplate.update("INSERT INTO test VALUES(NULL, ?, ?);", name, password);
    }
}
