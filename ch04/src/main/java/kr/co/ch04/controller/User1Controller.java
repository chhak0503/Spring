package kr.co.ch04.controller;

import jakarta.servlet.http.HttpServletRequest;
import kr.co.ch04.dto.User1DTO;
import kr.co.ch04.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class User1Controller {


    private User1Service service;

    // 생성자 주입
    @Autowired
    public User1Controller(User1Service service) {
        this.service = service;
    }


    @RequestMapping(value = "/user1/list", method = RequestMethod.GET)
    public String list(Model model){

        // 서비스 호출
        List<User1DTO> user1List = service.findAll();

        // 모델 참조 공유
        model.addAttribute("user1List", user1List);
        
        // 뷰 포워드
        return "/user1/list";
    }

    @GetMapping("/user1/register")
    public String register(){
        return "/user1/register";
    }

    @PostMapping("/user1/register")
    public String register(User1DTO dto){
        System.out.println(dto);

        // 서비스 호출
        service.save(dto);

        // 리다이렉트 이동
        return "redirect:/user1/list";
    }

    @GetMapping("/user1/modify")
    public String modify(){
        return "/user1/modify";
    }

}
