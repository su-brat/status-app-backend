package com.status_app.statusApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerRedirectController {

    @GetMapping("/api-docs")
    public String redirectToSwaggerUi() {
        return "redirect:/swagger-ui/index.html";
    }
}