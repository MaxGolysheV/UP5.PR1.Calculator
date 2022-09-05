package com.example.TestProj.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Controller1
{
    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("title", "Main Page");
        return "html1";
    }

    @GetMapping("/post")
    public String post() {
        return "post";
    }
    @GetMapping("/get")
    public String get() {
        return "get";
    }

    @GetMapping("/calc")
    public String calc(Model model) {
        model.addAttribute("title", 186);
        return "html1";
    }

    @PostMapping("/res")
    public String resultPost(
            @RequestParam(value = "a",
                    required = false,
                    defaultValue = "0") int a,
            @RequestParam(value = "b",
                    required = false,
                    defaultValue = "0") int b,
            @RequestParam(value = "operation",
                    required = false,
                    defaultValue = "+") String o,
            Model model) {
            int c = 0;
            switch (o)
            {
                case "+": c= a + b; break;
                case "-": c= a - b; break;
                case "*": c= a * b; break;
                case "/": c= a / b; break;
            }
            model.addAttribute("answer", c);
        return "res";
    }

    @GetMapping("/resultGet")
    public String resultGet(
            @RequestParam(value = "a",
                    required = false,
                    defaultValue = "0") int a,
            @RequestParam(value = "b",
                    required = false,
                    defaultValue = "0") int b,
            @RequestParam(value = "operation",
                    required = false,
                    defaultValue = "+") String o,
            Model model) {
        int c = 0;
        switch (o)
        {
            case "+": c= a + b; break;
            case "-": c= a - b; break;
            case "*": c= a * b; break;
            case "/": c= a / b; break;
        }
        model.addAttribute("answer", c);
        return "res";
    }
}
