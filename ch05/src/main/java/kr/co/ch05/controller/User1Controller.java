package kr.co.ch05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class User1Controller {

    @RequestMapping(value = "/user1/list", method = RequestMethod.GET)
    public String list(){
        return "/user1/list";
    }

    @GetMapping("/user1/register")
    public String register(){
        return "/user1/register";
    }

    @GetMapping("/user1/modify")
    public String modify(){
        return "/user1/modify";
    }

}