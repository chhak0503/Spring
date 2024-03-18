package kr.co.sboard.service;

import kr.co.sboard.dto.TermsDTO;
import kr.co.sboard.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {


    private final UserMapper userMapper;

    public TermsDTO selectTerms(){
        return userMapper.selectTerms();
    }

}
