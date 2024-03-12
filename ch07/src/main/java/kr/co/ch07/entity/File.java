package kr.co.ch07.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name="board_file")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fno;
    private String oName;
    private String sName;

    @OneToOne
    @JoinColumn(name = "ano")
    private Article article;

}
