package com.taxes.solartaxes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping("/")
    public String homeView() {
        return "Index";
    }

    @GetMapping("/about")
    public String aboutView() {
        return "about";
    }

    @GetMapping("/appointment")
    public String appointmentView() {
        return "appointment";
    }
}
