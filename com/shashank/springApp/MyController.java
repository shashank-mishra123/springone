package com.shashank.springApp;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {
    public static String mymethod() {
        System.out.println(" hii in my method");
        return "index.html";
    }
    @PostMapping ("/")
    public static int getData(@RequestParam int num1 ,@RequestParam int num2)
    {
        return num1+num2;
    }
}
