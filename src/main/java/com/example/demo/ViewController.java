package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/students")
    public String ListStudents(Model model) {
        return "students";
    }

    @RequestMapping("/courses")
    public String ListCourses(Model model) {
        return "courses";
    }

    @RequestMapping("/addStudentForm")
    public String AddStudentForm() {
        return "addstudentform";
    }

}
