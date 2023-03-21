package com.learning.springboot.service;

import com.learning.springboot.entity.Student;

import java.util.List;

public interface StudentService {
    Student saveStudents(Student student);

    List<Student> getStudents();

    Student getStudentByID(long rollNo);

    void deleteStudentByID(long rollNo);

    Student updateStudentByID(long rollNo, Student student);
}
