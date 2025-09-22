package kr.co.ch06.repository.board;

import jakarta.transaction.Transactional;
import kr.co.ch06.entity.board.Article;
import kr.co.ch06.entity.board.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ArticleRepositoryTest {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Test
    void insertArticleTest(){

        Article article = Article.builder()
                .title("제목 3")
                .content("내용 3")
                .author("a103")
                .build();

        articleRepository.save(article);
    }

    @Test
    void insertCommentTest(){

        Article article = Article.builder()
                            .ano(1)
                            .build();

        Comment comment = Comment.builder()                
                .content("댓글3")
                .author("a102")
                .article(article)
                .build();

        commentRepository.save(comment);
    }

    @Test
    @Transactional
    void selectArticleAllTest(){

        List<Article> articleList = articleRepository.findAll();
        System.out.println(articleList);

    }



}