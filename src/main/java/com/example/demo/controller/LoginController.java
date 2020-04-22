package com.example.demo.controller;

import com.example.demo.form.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String login(@ModelAttribute UserForm userForm, Model model){
        String s = userForm.getName() + userForm.getPassword();
        System.out.println(s);
        model.addAttribute("user", userForm.getName());
        return "loginsuccess";
    }
}
