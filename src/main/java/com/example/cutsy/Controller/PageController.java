package com.example.cutsy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PageController {
    @GetMapping("/index")
    public String showIndexPage() {
        System.out.println("Inside showIndexPage");
        return "This is the index page content";
    }
}