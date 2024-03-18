package kr.co.sboard.mapper;

import kr.co.sboard.dto.TermsDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public TermsDTO selectTerms();
    public void insertUser();
    public void selectUser();
    public void selectUsers();
    public void updateUser();
    public void deleteUser();


}
