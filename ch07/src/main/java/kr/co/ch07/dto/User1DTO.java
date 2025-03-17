package kr.co.ch07.dto;

import lombok.*;
import org.springframework.data.repository.NoRepositoryBean;

@Data
@Builder
public class User1DTO {

    private String uid;
    private String name;
    private String hp;
    private int age;
    
    // Entity 변환 메서드 정의

}
