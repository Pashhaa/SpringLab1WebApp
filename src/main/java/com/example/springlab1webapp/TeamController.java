package com.example.springlab1webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeamController {
    @GetMapping("/team")
    public String teamInfo(){
        return "TeamInfo.html";
    }
}
