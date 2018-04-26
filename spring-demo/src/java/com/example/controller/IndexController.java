package com.example.controller;

import com.example.entity.Customer;
import com.example.mapper.CustomerMapper;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/index")
    public String index(Map<String, Object> map) {
        map.put("name","###蚂蚁课堂###");
        map.put("sex",1);
        List<String> userlist=new ArrayList<String>();
        userlist.add("余胜军");
        userlist.add("张三");
        userlist.add("李四");
        map.put("userlist",userlist);
        return "index";
    }

    @ResponseBody
    @RequestMapping("/findByName")
    public Customer findByName(String name) {
        Customer model = customerMapper.findByName(name);
        return model;
    }

    @ResponseBody
    @RequestMapping("/addCustomer")
    public Integer addCustomer(String name, String password) {
        int customer = customerService.addCustomer(name, password);
        return customer;
    }

}
