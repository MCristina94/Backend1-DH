package com.dh.clinica.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.net.http.HttpResponse;

@Controller
public class MainController {

    @GetMapping
    public String redirect (){
        return "index.html";
    }
}
