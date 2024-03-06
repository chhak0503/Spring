package kr.co.ch05.service;

import kr.co.ch05.dao.User1DAO;
import kr.co.ch05.dto.User1DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User1Service {

    private final User1DAO dao;

    @Autowired
    public User1Service(User1DAO dao){
        this.dao = dao;
    }

    public void insertUser1(User1DTO user1DTO){
        dao.insertUser1(user1DTO);
    }
    public void selectUser1(){
        dao.selectUser1();
    }
    public void selectUser1s(){
        dao.selectUser1s();
    }
    public void updateUser1(){
        dao.updateUser1();
    }
    public void deleteUser1(){
        dao.deleteUser1();
    }
}
