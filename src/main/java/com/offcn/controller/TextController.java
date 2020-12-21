package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TextController {

    @GetMapping("/text")
    public String text(Model model){

        model.addAttribute("messsage", "hell0 world");
        return "one";

    }

}
