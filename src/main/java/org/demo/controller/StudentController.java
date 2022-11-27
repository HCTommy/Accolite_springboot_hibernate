package org.demo.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
//    StudentService studentService;

    @GetMapping("/getstudents")
    public void getAllStudents(){
        System.out.println("reach here");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
