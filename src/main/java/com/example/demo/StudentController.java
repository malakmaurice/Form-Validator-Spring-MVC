package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/showForm")
    public String showForm(Model themodel){

        //add student object to model attribute
        themodel.addAttribute("student",new Student());
    return "student-form";
    }



    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent){
       // System.out.println(theStudent.getFirstName()+" "+theStudent.getLastName());
        return "process-Form";
    }
}
