package kr.co.ch06.controller;

import kr.co.ch06.dto.User1DTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class User1Controller {

    @GetMapping("/user1/list")
    public String list(){
        return "/user1/list";
    }

    @GetMapping("/user1/register")
    public String register(){
        return "/user1/register";
    }

    @PostMapping("/user1/register")
    public String register(User1DTO user1DTO){
        log.info(user1DTO.toString());


        return "redirect:/user1/list";
    }

    @GetMapping("/user1/modify")
    public String modify(){
        return "/user1/modify";
    }

    @GetMapping("/user1/delete")
    public String delete(){
        return "redirect:/user1/list";
    }
}
