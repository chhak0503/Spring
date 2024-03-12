package kr.co.ch07.repository;

import kr.co.ch07.entity.User1;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class User1RepositoryTest {
    /**
     * JUnit 테스트에서는 @Autowired 주입
     * 생성자 주입은 No ParameterResolver registered for parameter 에러 발생
     * 시간날때 왜 그런지 알아볼것
     */
    @Autowired
    private User1Repository repository;


    @DisplayName("user1 등록")
    public void insertUser1(){
        // given - entity 준비
        User1 user1 = User1.builder()
                        .uid("j101")
                        .name("김유신")
                        .birth("1990-03-12")
                        .hp("010-1234-1002")
                        .age(21)
                        .build();

        // when - entity 저장
        repository.save(user1);
    }


    @DisplayName("user1 조회")
    public void selectUser1(){
        // given - 조회 아이디
        String uid = "j101";

        // when - 조회하기
        Optional<User1> result = repository.findById(uid);
        User1 user1 = result.get();
        log.info(user1.toString());
    }

    @DisplayName("user1 목록")
    public void selectUser1s(){

    }

    @DisplayName("user1 수정")
    public void updateUser1(){

    }

    @DisplayName("user1 삭제")
    public void deleteUser1(){

    }
}