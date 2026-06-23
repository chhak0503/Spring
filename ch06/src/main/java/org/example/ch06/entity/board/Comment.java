package org.example.ch06.entity.board;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "board_comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT 어노테이션
    private int cno;

    private int parent; // 댓글의 부모 글 번호

    private String content;

    private String writer;

    @CreationTimestamp  // 해당 엔티티가 INSERT 될때 현재 날짜시간 생성
    private LocalDateTime wdate;


}












