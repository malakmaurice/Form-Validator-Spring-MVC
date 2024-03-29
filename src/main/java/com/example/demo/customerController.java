package com.example.demo;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class customerController {

    //add initbinder to pre-preocessing for every web request
    //that method to remove the white space from all input strings

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor =new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }
    @RequestMapping("/showForm")
    public String showForm(Model themodel){
        themodel.addAttribute("customer",new Customer());
        return "customer-form";
    }

     @RequestMapping ("/processForm")
    public String processForm(@Valid @ModelAttribute("customer")Customer theCustomer, BindingResult theBindingResult){
        if(theBindingResult.hasErrors())
            return "customer-form";
        else
            return "customer-confirm";
    }
}
