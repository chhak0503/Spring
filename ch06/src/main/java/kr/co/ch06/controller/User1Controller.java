package kr.co.ch06.controller;

import kr.co.ch06.dto.User1DTO;
import kr.co.ch06.service.User1Service;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Controller
public class User1Controller {

    private final User1Service user1Service;

    @GetMapping("/user1/list")
    public String list(Model model){

        List<User1DTO> user1List = user1Service.findAll();
        model.addAttribute("user1List", user1List);

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
