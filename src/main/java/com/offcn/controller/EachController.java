package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
public class EachController {

    @GetMapping("/each")
    public String each(Model model){

        List<User> list = new LinkedList<>();

        User user1 = new User();
        user1.setBrithday(new Date());
        user1.setId(1);
        user1.setName("first");
        list.add(user1);

        User user2 = new User();
        user2.setBrithday(new Date());
        user2.setId(2);
        user2.setName("second");
        list.add(user2);

        User user3 = new User();
        user3.setBrithday(new Date());
        user3.setId(3);
        user3.setName("third");
        list.add(user3);

        model.addAttribute("list",list );

        model.addAttribute("flag", true) ;

        return "three";


    }

}
