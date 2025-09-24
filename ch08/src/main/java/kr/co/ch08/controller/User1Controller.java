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

    @ResponseBody // 컨트롤러의 요청 메서드의 반환값을 View로 출력하지 않고 응답객체 Response body로 출력, JSON 출력
    @GetMapping("/user1")
    public List<User1DTO> list(){
        List<User1DTO> dtoList = user1Service.getUserAll();
        return dtoList;
    }

    @GetMapping("/user1/{userid}")
    public void user1(@PathVariable("userid") String userid){}

    @ResponseBody
    @PostMapping("/user1")
    public String register(User1DTO user1DTO){

        log.info("user1DTO={}", user1DTO);
        user1Service.save(user1DTO);

        return "success";
    }

    @PutMapping("/user1")
    public void modify(User1DTO user1DTO){}

    @DeleteMapping("/user1/{userid}")
    public void delete(@PathVariable("userid") String userid){}


}
