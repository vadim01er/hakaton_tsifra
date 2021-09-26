package ru.divyatyybe.hakaton_tsifra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/info")
    public String main() {
        return "info";
    }
}
