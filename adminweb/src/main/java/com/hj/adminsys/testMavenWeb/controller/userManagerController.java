package com.hj.adminsys.testMavenWeb.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hj.adminsys.testMavenWeb.dao.UserMapper;
import com.hj.adminsys.testMavenWeb.dto.User;

@RestController
@RequestMapping("/userManager")
public class userManagerController {
	@Autowired
	UserMapper userService;
	
    @RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request) {
		return new ModelAndView("userManager");
	}
    
    @ResponseBody
    @RequestMapping("/find")
	public ModelAndView find(HttpServletRequest request,Map<String, Object> model) {
    	User user=userService.findUser("test");
    	model.put("user", user);
		return new ModelAndView("userManager", model);
		
	}
    
    @ResponseBody
    @RequestMapping("/finds")
	public User finds(HttpServletRequest request) {
    	User user=userService.findUser("test");
		return user;
		
	}
    
    
}
