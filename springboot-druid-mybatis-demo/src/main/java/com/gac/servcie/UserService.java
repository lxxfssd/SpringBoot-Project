package com.gac.servcie;

import com.gac.entity.User;
import com.gac.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(Long id){
        return userMapper.findById(id);
    }

    public List<User> list(String name) {
        return userMapper.list(name);
    }

    public User findOne() {
        User user = new User();
        user.setId(1L);
        return userMapper.selectOne(user);
    }
}
