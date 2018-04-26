package com.example.service;

import com.example.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Transactional  //开启事务，失败回滚
    public int addCustomer(String name, String password) {
        int insert = customerMapper.insert(name, password);
//        int i = 1/0;
        return insert;
    }
}
