package kr.co.ch08.controller;

import kr.co.ch08.dto.User1DTO;
import kr.co.ch08.service.User1Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
public class User1Controller {

    private final User1Service user1Service;

    @ResponseBody
    @GetMapping("/user1")
    public List<User1DTO> list(){
        List<User1DTO> dtoList = user1Service.getUserAll();
        return dtoList;
    }

    @GetMapping("/user1/{userid}")
    public void user1(@PathVariable("userid") String userid){}

    @PostMapping("/user1")
    public void register(User1DTO user1DTO){}

    @PutMapping("/user1")
    public void modify(User1DTO user1DTO){}

    @DeleteMapping("/user1/{userid}")
    public void delete(@PathVariable("userid") String userid){}


}
