package com.example.bthotro1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class Calculator {
    @GetMapping("")
    public String home(){
        return "/home";
    }

    @GetMapping("/result")
    public String sum(@RequestParam(name = "num1") int num1,
                      @RequestParam(name = "num1") int num2,
                      Model model){

        int result = num1 + num2;
        model.addAttribute("result", result);

        return "/result";
    }
}
