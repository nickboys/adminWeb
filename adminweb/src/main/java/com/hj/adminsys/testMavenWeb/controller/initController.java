package com.hj.adminsys.testMavenWeb.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/user")
public class initController {
    
    @RequestMapping(value = "/index")
    public ModelAndView login(Map<String, Object> model) {
        return new ModelAndView("login",model);
    }
}
