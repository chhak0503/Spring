package kr.co.ch06.repository;

import kr.co.ch06.dto.User1DTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User1Repository extends JpaRepository<User1DTO, Integer> {




}
