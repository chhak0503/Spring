package kr.co.ch08.controller;

import kr.co.ch08.dto.UserDTO;
import kr.co.ch08.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@AllArgsConstructor
@Controller
public class UserController {

    private final UserService service;


    @GetMapping("/user/login")
    public String login(){
        return "/user/login";
    }

    @GetMapping("/user/register")
    public String register(){
        return "/user/register";
    }

    @PostMapping("/user/register")
    public String register(UserDTO userDTO){
        service.insertUser(userDTO);
        return "redirect:/user/login";
    }

    @GetMapping("/user/success")
    public String success(){
        return "/user/success";
    }

}
