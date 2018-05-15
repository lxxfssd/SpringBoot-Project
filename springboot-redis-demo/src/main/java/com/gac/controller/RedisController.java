package com.gac.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.gac.configutils.JsonMapper;
import com.gac.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/setRedisValue")
    public String setRedisValue(String key, String value) throws JsonProcessingException {
        ValueOperations<String, String> vos = redisTemplate.opsForValue();
        User user = new User();
        user.setId(1l);
        user.setName("hehda");
        user.setAge(12);
        vos.set("NI:HAO:"+key, JsonMapper.toJson(user));
        return "sueccess";
    }

    @GetMapping("/getRedisValue")
    public User getRedisValue(String key) throws IOException {
        ValueOperations<String, String> vos = redisTemplate.opsForValue();
        String value = vos.get("NI:HAO:"+key);
        return JsonMapper.fromJson(value, User.class);
    }
}
