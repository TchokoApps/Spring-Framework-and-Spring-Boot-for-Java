package com.tchokoapps.springboot.springboottutorialjsps.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthController {
    @RequestMapping("/admin")
    public String admin() {
        return "admin";
    }
}
