package com.hj.adminsys.testMavenWeb.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hj.adminsys.testMavenWeb.dao.UserMapper;
import com.hj.adminsys.testMavenWeb.dto.User;
import com.hj.adminsys.testMavenWeb.service.UserService;

@RestController
@RequestMapping(value = "/user")
//@MapperScan("com.hj.adminsys.testMavenWeb.dao")
public class loginController {
	@Autowired
	UserMapper userService;
    @RequestMapping(value = "/login")
    public ModelAndView login(HttpServletRequest request,Map<String, Object> model) {
        //model.put("msg", "成功");
        User user=userService.findUser(request.getParameter("name"));
        System.err.println(user.getName()+user.getPassword());
        if (user!=null) {
			if (user.getPassword().equals(request.getParameter("password"))) {
				 model.put("msg", "登录成功");
	             return new ModelAndView("main", model);
			}else {
				 model.put("msg", "密碼錯誤");
	             return new ModelAndView("fail", model);
			}
		}else {
			 model.put("msg", "失敗");
             return new ModelAndView("fail", model);
		}
       /* if (request.getParameter("name").equals("test")) {
            if (request.getParameter("password").equals("test")) {
                model.put("msg", "登录成功");
                return new ModelAndView("success", model); 
            }else {
                model.put("msg", "登录失败");
                return new ModelAndView("fail", model); 
            }
        }else {
            return new ModelAndView("login", model); 
        }*/
    }
}
