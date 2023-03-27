package com.moneshwar.DTO.controller;

import com.moneshwar.DTO.entity.User;
import com.moneshwar.DTO.service.UserService;
import com.moneshwar.DTO.service.dto.UserGetDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/{id}")
    UserGetDTO getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }
    @PostMapping("/")
    User saveUser(User user){
        return  userService.saveUser(user);
    }

}
