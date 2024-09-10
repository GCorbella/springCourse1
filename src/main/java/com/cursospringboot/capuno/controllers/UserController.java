package com.cursospringboot.capuno.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Hello World, Spring Boot");
        model.addAttribute("name","Andrew");
        model.addAttribute("lastname","Guzman");
        return "details";
    }
}
