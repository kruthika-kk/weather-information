package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Webcontroller {

    @RequestMapping("/hello")
    public  String  sayHello(Model model){
        System.out.println("Saying Hello World SpringBoot");
        model.addAttribute("messgae","Greetings from Kruthika");
        return  "hello";

    }
}
