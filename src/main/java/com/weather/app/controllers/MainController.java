package com.weather.app.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
    @GetMapping("/")
    public String mainPage (Model model) {
        model.addAttribute("title", "Weather App");
        return "pages/homePage";
    }
}
