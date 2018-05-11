package com.gac.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gac.entity.User;
import com.gac.servcie.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/select")
    public PageInfo<User> select(String name) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        LOG.info("--------log------");
        //第一个参数：第几页
        //第二个参数：每页显示条数
        PageHelper.startPage(1,2);
        List<User> list = userService.list(name);
        PageInfo<User> page = new PageInfo<User>(list);
        LOG.info(mapper.writeValueAsString(page));
        LOG.debug(mapper.writeValueAsString(page));
        return page;
    }

}
