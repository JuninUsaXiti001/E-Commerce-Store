package com.project.protection.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoggedController {

    @GetMapping("/")
    public String logged() {
        return "html/pages/main.html";
    }


    @GetMapping("/produto")
    public String product(@RequestParam(value = "id", required = false) String id) {
        return  "html/pages/product";
    }
}
