package com.hj.adminsys.testMavenWeb.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

import com.hj.adminsys.testMavenWeb.dto.User;
@Mapper
public interface UserMapper {
	@Select("SELECT * FROM T_USER WHERE NAME = #{name}")
    User findUser(@Param("name")String name);
}
