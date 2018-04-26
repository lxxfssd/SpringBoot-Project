package com.gac.controller;

import com.gac.entity.User;
import com.gac.test01.dao.User01Mapper;
import com.gac.test01.service.User01Service;
import com.gac.test02.service.User02Service;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    private static Logger logger = Logger.getLogger(IndexController.class);

    @Autowired
    private User01Service user01Service;

    @Autowired
    private User02Service user02Service;

    @Autowired
    private User01Mapper user01Mapper;

    @Autowired
    private CacheManager cacheManager;

    @Value("${testName}")
    private String name;

    @RequestMapping("/add")
    public String addUser() {
        user01Service.addUser("test01", 19);
        user02Service.addUser("test02", 20);
        return "success";
    }

    @RequestMapping("/log")
    public String log() {
        logger.info("日志打印中....");
        return "success";
    }

    @RequestMapping("/addUser")
    public String addUser(Integer age) {
        return "success";
    }

    @ResponseBody
    @RequestMapping("/cache")
    public User cache(Integer id) {
        User user = user01Mapper.selectUser(id);
        return user;
    }

    /**
     * 清除echa缓存
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/remo")
    public String remo(Integer id) {
        cacheManager.getCache("baseCache").clear();
        return "success";
    }

    @ResponseBody
    @RequestMapping("/sedSms")
    public String sedSms() {
        System.out.println("###indexController### 1");
        user01Service.sedSms();
        System.out.println("###indexController### 4");
        return "success";
    }

    @ResponseBody
    @RequestMapping("/getValue")
    public String getValue() {
        return name;
    }
}
