package org.example.ch09.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.example.ch09.dto.UserDTO;
import org.example.ch09.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Log4j2
@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService service;

    //@ResponseBody
    @PostMapping("/user")
    public ResponseEntity<UserDTO> register(@RequestBody UserDTO dto){
        log.info(dto);

        UserDTO savedUser1 = service.register(dto);

        // 응답 객체 생성
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedUser1);
    }

    @GetMapping("/user")
    public List<UserDTO> list(){
        List<UserDTO> dtoList = service.getUserAll();
        return dtoList;
    }

}
