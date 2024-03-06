package kr.co.ch05.dao;

import kr.co.ch05.dto.User1DTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class User1DAO {

    private final SqlSessionTemplate mybatis;

    @Autowired
    public User1DAO(SqlSessionTemplate mybatis){
        this.mybatis = mybatis;
    }

    public void insertUser1(User1DTO user1DTO){
        mybatis.insert("user1.insertUser1", user1DTO);
    }
    public void selectUser1(){

    }
    public void selectUser1s(){

    }
    public void updateUser1(){

    }
    public void deleteUser1(){

    }
}
