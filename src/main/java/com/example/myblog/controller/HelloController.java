package com.example.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "helloworld"; // 해당 파일을 보여줘
    }

    @GetMapping("/greetings")
    public String hi(){
        return "nicetomeetyou"; // 해당 파일을 보여줘
    }

    @GetMapping("/welcome")
    public String testtest(){
        return "test"; // 해당 파일을 보여줘
    }

}
