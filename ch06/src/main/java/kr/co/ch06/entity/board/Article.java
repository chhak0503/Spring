package kr.co.ch06.entity.board;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    private int ano;
    private String title;
    private String content;
    private String author;

    // @OneToMany 관계설정에 반드시 mappedBy 속성은 양방향 관계에서 기준이 되는 속성, FK가 되는 엔티티 속성
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "article")
    private List<Comment> commentList;


    @CreationTimestamp
    private LocalDateTime wdate; // JPA 현재 날짜시간 클래스로 @CreationTimestamp 어노테이션으로 현재 날짜시간 처리
}
