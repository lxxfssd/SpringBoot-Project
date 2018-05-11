package com.gac.servcie;

import com.gac.entity.User;
import com.gac.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserMapper userMapper;

    public User findById(Long id){
        return userMapper.findById(id);
    }

    public List<User> list(String name) {
        LOG.info("----------UserService----------");
        return userMapper.list(name);
    }

}
