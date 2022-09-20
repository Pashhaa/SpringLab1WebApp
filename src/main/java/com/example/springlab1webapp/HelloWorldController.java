package com.example.springlab1webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.text.html.HTML;

@Controller
public class HelloWorldController {
    @GetMapping("/")
    @ResponseBody
    public String helloWorld (){
        return "Hello World!";
    }

}
