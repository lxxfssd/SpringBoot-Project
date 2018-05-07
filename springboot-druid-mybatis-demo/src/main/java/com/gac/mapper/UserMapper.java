package com.gac.mapper;

import com.gac.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    public void add(User user);

    public User findById(@Param(value="id") long id);

    public void delete(@Param(value="id")long id);

    public void update(User User);

    public List<User> list(@Param(value="name")String name);
}
