package com.gac.test02.service;

import com.gac.test02.dao.User02Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User02Service {

    @Autowired
    private User02Mapper user02Mapper;
    
    public int addUser(String name, Integer age) {
        return user02Mapper.addUser(name, age);
    }
}
