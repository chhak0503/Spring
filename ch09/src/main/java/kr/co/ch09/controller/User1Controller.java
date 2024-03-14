package kr.co.ch09.controller;

import kr.co.ch09.dto.User1DTO;
import kr.co.ch09.service.User1Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
public class User1Controller {

    private final User1Service user1Service;

    /*
        @ResponseBody
         - 메서드의 반환값을 응답객체 내용 본문으로 출력
         - JSON 출력 어노테이션

        @PathVariable
         - 주소 파라미터 값을 수신
    */
    @ResponseBody
    @GetMapping("/user1")
    public List<User1DTO> list(){
        List<User1DTO> user1s = user1Service.selectUser1s();
        return user1s;
    }

    @ResponseBody
    @GetMapping("/user1/{uid}")
    public User1DTO user1(@PathVariable("uid") String uid){
        User1DTO user1DTO = user1Service.selectUser1(uid);
        return user1DTO;
    }

    @ResponseBody
    @PostMapping("/user1")
    public void register(User1DTO user1DTO){

        user1Service.insertUser1(user1DTO);

    }


}
