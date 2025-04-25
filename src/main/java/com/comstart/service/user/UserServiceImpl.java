package com.comstart.service.user;
import  com.comstart.mapper.UserMapper;
import com.comstart.vo.UserVO;
import lombok.RequiredArgsConstructor;  
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Override
    public void registerUser(UserVO userVO) {
        userMapper.insertUser(userVO);
    }

    @Override
    public UserVO login(UserVO userVO) {
        return userMapper.selectUserByIdAndPassword(userVO);
    }
    
}
