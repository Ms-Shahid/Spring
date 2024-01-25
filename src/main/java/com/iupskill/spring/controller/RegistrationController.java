package com.iupskill.spring.controller;

import com.iupskill.spring.model.Registration;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistrations(@ModelAttribute("registration")Registration registration){
        return "registration";
    }
    @PostMapping("registration")
    public String postRegistrations(@Valid @ModelAttribute("registration")
                                        Registration registration,
                                    BindingResult result){

        if( result.hasErrors()) {
            System.out.println("There are some errors ");
            return "registration";
        }
        System.out.println("Registration -> " + registration.getName());
        return "redirect:registration";
    }
}
