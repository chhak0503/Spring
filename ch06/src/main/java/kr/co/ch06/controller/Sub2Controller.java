package kr.co.ch06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sub2Controller {

    @GetMapping("/sub2/content1")
    public String content1(){
        return "/sub2/content1";
    }

    @GetMapping("/sub2/content2")
    public String content2(){
        return "/sub2/content2";
    }
}
