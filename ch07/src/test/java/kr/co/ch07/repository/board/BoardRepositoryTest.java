package kr.co.ch07.repository.board;

import kr.co.ch07.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class BoardRepositoryTest {

    @Autowired private ArticleRepository articleRepository;
    @Autowired private CommentRepository commentRepository;
    @Autowired private FileRepository fileRepository;
    @Autowired private UserRepository userRepository;

    @Test
    public void insertUser(){

        User user = User.builder()
                    .uid("a101")
                    .name("김유신")
                    .hp("010-1234-1001")
                    .build();

        userRepository.save(user);
    }



}