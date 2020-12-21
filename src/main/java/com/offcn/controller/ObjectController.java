package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ObjectController {

    @GetMapping("/obj")
    public String two (Model model){

        User user = new User();
        user.setId(1);
        user.setName("ms");
        user.setBrithday(new Date());

        Map<String,Object>  map = new HashMap<>();
        map.put("aa", "1.jpg");

        model.addAttribute("map", map);
        model.addAttribute("user",user );

        return "two";

    }

}
