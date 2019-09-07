package com.example.lottery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * blingbling ✨
 */
@Controller
public class IndexController {
    @GetMapping("/index.html")
    public String newindex() {
        System.out.println("111");
        return "index";
    }

}
