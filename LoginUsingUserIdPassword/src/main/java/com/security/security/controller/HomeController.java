package com.security.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String homePage()
    {
        return "<h1>Welcome to Security Session</h1>";
    }
    @GetMapping("/user")
    public String user()
    {
        return "<h1>Welcome to User Session</h1>";
    }
    @GetMapping("/admin")
    public String admin()
    {
        return "<h1>Welcome to Admin Session</h1>";
    }

}
