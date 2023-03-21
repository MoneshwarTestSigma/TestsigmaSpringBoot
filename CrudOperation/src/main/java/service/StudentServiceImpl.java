package com.learning.springboot.service;

import com.learning.springboot.entity.Student;
import com.learning.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student saveStudents(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentByID(long rollNo) {
        return studentRepository.findById(rollNo).get();
    }

    @Override
    public void deleteStudentByID(long rollNo) {
        studentRepository.deleteById(rollNo);
    }

    @Override
    public Student updateStudentByID(long rollNo, Student student) {
        Student currentStudent=studentRepository.findById(rollNo).get();
        currentStudent.setName(student.getName());
        return studentRepository.save(currentStudent);
    }
}
