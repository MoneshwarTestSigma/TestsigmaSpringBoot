package com.learning.springboot.controller;


import com.learning.springboot.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller()
@RequestMapping(path = "/view")
public class ViewController {
    @Autowired
    StudentController studentController;
    @GetMapping(value = "/user")//We need to create separate package for view'
    public String getHTMLrespons(Model model)
    {
        List<Student> list=studentController.getStudents();
        model.addAttribute("students",list);
        return "details";
    }
    private String getDetailsFromObject(List<Student> list) {
        String ans="";
        for(Student student:list)
        {
            ans=ans+student.getRollNo()+" "+student.getName()+"<br>";
        }
        return ans;
    }
}
