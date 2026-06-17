package org.example.ch05.controller;


import lombok.RequiredArgsConstructor;
import org.example.ch05.dto.User1DTO;
import org.example.ch05.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class User1Controller {

    // @RequiredArgsConstructor 어노테이션으로 의존객체 주입 ⭐⭐⭐⭐⭐
    private final User1Service service;

    @GetMapping("/user1/list")
    public String list(Model model){

        // 조회 서비스 요청
        List<User1DTO> dtoList = service.getAll();

        // 모델참조: 뷰(html)에서 컨트롤러 데이터 참조
        model.addAttribute("dtoList", dtoList);

        return "/user1/list";
    }

    @GetMapping("/user1/register")
    public String register(){
        return "/user1/register";
    }

    @PostMapping("/user1/register")
    public String register(User1DTO dto){
        System.out.println(dto);
        
        // 등록 서비스 호출
        service.register(dto);


        return "redirect:/user1/list";
    }

    @GetMapping("/user1/modify")
    public String modify(){
        return "/user1/modify";
    }
}
