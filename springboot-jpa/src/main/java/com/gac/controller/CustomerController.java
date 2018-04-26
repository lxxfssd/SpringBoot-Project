package com.gac.controller;

import com.gac.dao.CustomerDao;
import com.gac.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerDao customerDao;

    @RequestMapping("/findByName")
    public Customer findByName(Integer id) {
        Customer one = customerDao.findOne(id);
        return one;
    }

}
