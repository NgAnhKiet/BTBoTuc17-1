package com.example.bthotro2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class CaculatorController {
    @GetMapping("")
    public String home(){
        return "/home";
    }

    @GetMapping("/calculate")
    public String calculate (@RequestParam("number1") double num1,
                             @RequestParam("number2") double num2,
                             @RequestParam("option") String option,
                             Model model){
        double result = 0;
        switch (option) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        model.addAttribute("result",result);
        return "/result";
    }
}
