package com.tchokoapps.springboot.springboottutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

    @RequestMapping("/admin")
    String admin() {
        return "admin";
    }
}