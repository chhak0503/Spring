package kr.co.ch07.service;

import kr.co.ch07.dto.User1DTO;
import kr.co.ch07.entity.User1;
import kr.co.ch07.repository.User1Repository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class User1Service {

    // @RequiredArgsConstructor 어노테이션으로 생성자 주입
    private final User1Repository repository;

    public void register(User1DTO user1DTO){
        log.info("user1DTO " + user1DTO);

        // DTO를 Entity로 변환
        User1 user1 = user1DTO.toEntity();
        log.info("user1 " + user1);

        // Entity 저장(Insert 실행)
        repository.save(user1);
    }

    public List<User1DTO> findAll(){
        return null;
    }

    public User1DTO findById(String uid){
        return null;
    }

    public void modify(User1DTO user1DTO){

    }

    public void delete(String uid){

    }

}
