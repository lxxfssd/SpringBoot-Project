package com.gac.test01.dao;

import com.gac.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

@CacheConfig(cacheNames = "baseCache")
public interface User01Mapper {

    @Insert("insert into user(name, age) values(#{name}, #{age})")
    public int addUser(@Param("name") String name, @Param("age") Integer age);

    @Select("select * from user where id = #{id}")
    @Cacheable
    public User selectUser(@Param("id") Integer id);
}
