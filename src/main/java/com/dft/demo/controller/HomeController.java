package com.dft.demo.controller;

import com.dft.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

@Controller
public class HomeController {

    @Inject
    StudentService studentService;

    @RequestMapping(name = "/student", method = {RequestMethod.POST, RequestMethod.GET})
    public String home(Model model) {
        model.addAttribute("studentList", studentService.getAll());
        return "student";
    }
}
