package com.example.mapper;

import com.example.entity.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CustomerMapper {

   @Select("SELECT * FROM test WHERE user_name = #{name}")
   Customer findByName(@Param("name") String name);

   @Insert("INSERT INTO test(user_name, password) VALUES(#{name}, #{password})")
   int insert(@Param("name") String name, @Param("password") String password);
}
