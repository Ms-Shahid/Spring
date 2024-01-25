package com.iupskill.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class Greeting {

    @GetMapping(value="greeting")
    public String greeting(Map<String, Object> model){
        model.put("message", "Welcome 😎");
        return "/WEB-INF/jsp/index.jsp";
    }
    @GetMapping(value="thymeleaf")
    public String thymeleaf(Map<String, Object> model){
        model.put("message", "Hey Thyme");
        return "thyme";
    }
}
