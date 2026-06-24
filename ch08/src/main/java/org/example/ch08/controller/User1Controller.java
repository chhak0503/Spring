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

    @ResponseBody
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

    @ResponseBody
    @PutMapping("/user1")
    public User1DTO modify(@RequestBody User1DTO dto){
        log.info(dto);

        User1DTO modifiedUser1 = service.modify(dto);

        return modifiedUser1;
    }

    @ResponseBody
    @DeleteMapping("/user1/{userid}")
    public boolean remove(@PathVariable("userid") String userid){
        log.info(userid);

        boolean result = service.remove(userid);

        return result;
    }
}
