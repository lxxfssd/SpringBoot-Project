package com.gac.test02.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface User02Mapper {

    @Insert("insert into user(name, age) values(#{name}, #{age})")
    public int addUser(@Param("name") String name, @Param("age") Integer age);
}
