package kr.co.ch07.entity.board;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "Board_Article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 어노테이션
    private int no;
    private String title;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "writer")
    private User user;

    @OneToMany(mappedBy = "article")
    private List<Comment> comment;

    @OneToMany(mappedBy = "article")
    private List<File> file;

    private String wdate;





}
