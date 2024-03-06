package kr.co.ch05.controller;

import kr.co.ch05.dto.User1DTO;
import kr.co.ch05.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class User1Controller {

    private final User1Service service;

    @Autowired
    public User1Controller(User1Service service) {
        this.service = service;
    }

    @RequestMapping(value = "/user1/list", method = RequestMethod.GET)
    public String list(){
        return "/user1/list";
    }

    @GetMapping("/user1/register")
    public String register(){
        return "/user1/register";
    }

    @PostMapping("/user1/register")
    public String register(User1DTO user1DTO){
        System.out.println(user1DTO);

        // 등록
        service.insertUser1(user1DTO);

        // 리다이렉트
        return "redirect:/user1/list";
    }


    @GetMapping("/user1/modify")
    public String modify(){
        return "/user1/modify";
    }

}
