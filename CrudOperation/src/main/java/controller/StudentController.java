package com.learning.springboot.controller;

import com.learning.springboot.entity.Student;
import com.learning.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(path = "/user")
public class StudentController {
    @Autowired // Dependency Injection happens here
    StudentService studentService;
    @PostMapping()
    public Student saveStudents(@RequestBody Student student) //We make use of @RequestBody because we here receive the data as JSON to get that we need this
    {
        return studentService.saveStudents(student);
    }
    @GetMapping()
    public List<Student> getStudents()
    {
        return studentService.getStudents();
    }
    //To fetch by using ID
    @GetMapping("/{id}")
    public Student getStudentByID(@PathVariable("id") long rollNo)
    {
        return studentService.getStudentByID(rollNo);
    }
    @DeleteMapping("/{id}")
    public String deleteStudentByID(@PathVariable("id") long rollNo)
    {
        studentService.deleteStudentByID(rollNo);
        return "Successfully deleted!!";
    }
    @PutMapping("/{id}")
    public Student updateStudentByID(@PathVariable("id") long rollNo, @RequestBody Student student)
    {
        return studentService.updateStudentByID(rollNo,student);
    }


}
