package com.comstart.mapper;
import com.comstart.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void insertUser(UserVO userVO);
    UserVO selectUserByIdAndPassword(UserVO userVO);
}