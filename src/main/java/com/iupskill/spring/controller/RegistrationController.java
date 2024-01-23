package com.iupskill.spring.controller;

import com.iupskill.spring.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistrations(@ModelAttribute("registration")Registration registration){
        return "registration";
    }
    @PostMapping("registration")
    public String postRegistrations(@ModelAttribute("registration")Registration registration){
        System.out.println("Registration -> " + registration.getName());
        return "redirect:registration";
    }
}
