package kr.co.ch07.entity.board;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "Board_User")
public class User {

    @Id
    private String uid;
    private String name;
    private String hp;
    private String regDate;
}
