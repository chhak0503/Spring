package kr.co.ch04.controller.user1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class User1Controller {

    @GetMapping("/user1/register")
    public String register(){
        return "/user1/register";
    }

    @GetMapping("/user1/list")
    public String list(){
        return "/user1/list";
    }
}
