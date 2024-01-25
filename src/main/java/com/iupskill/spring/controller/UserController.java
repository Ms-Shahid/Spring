package com.iupskill.spring.controller;

import com.iupskill.spring.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstname", defaultValue = "Shahid") String firstname,
                        @RequestParam(value = "lastname", defaultValue = "M") String lastname,
                        @RequestParam(value = "age", defaultValue = "10") int age) {

        User user = new User();
        user.setFirstName(firstname);
        user.setLastName(lastname);
        user.setAge(age);
        return user;
    }

    @PostMapping("/user")
    public User postUser(User user){
        System.out.println(" user info -> " + user.getFirstName());
        return user;
    }
}
