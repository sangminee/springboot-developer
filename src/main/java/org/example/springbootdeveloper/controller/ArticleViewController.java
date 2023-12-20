package org.example.springbootdeveloper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleViewController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
