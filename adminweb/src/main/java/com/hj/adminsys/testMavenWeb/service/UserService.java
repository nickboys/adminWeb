package com.hj.adminsys.testMavenWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hj.adminsys.testMavenWeb.dao.UserMapper;
import com.hj.adminsys.testMavenWeb.dto.User;
@Service
public class UserService {
    @Autowired
    UserMapper UserMapper;
    public User findUser(String name) {
    	
		return this.UserMapper.findUser(name);
		
	}
}
