package org.example.springbootdeveloper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserViewController { // 뷰 파일 연결하는 컨트롤러

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("signup")
    public String signup(){
        return "signup";
    }

}
