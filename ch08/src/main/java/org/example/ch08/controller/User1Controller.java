package org.example.ch08.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.example.ch08.dto.User1DTO;
import org.example.ch08.service.User1Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@Controller
public class User1Controller {

    private final User1Service service;

    @PostMapping("/user1")
    public User1DTO register(@RequestBody User1DTO dto){
        log.info(dto);

        User1DTO savedUser1 = service.register(dto);

        return savedUser1;
    }

    @ResponseBody
    @GetMapping("/user1")
    public List<User1DTO> list(){

        List<User1DTO> dtoList = service.getUserAll();

        return dtoList;
    }

    @PutMapping("/user1")
    public void modify(){}

    @DeleteMapping("/user1")
    public void delete(){}
}
