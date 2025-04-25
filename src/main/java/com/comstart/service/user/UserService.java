package com.comstart.service.user;

import com.comstart.vo.UserVO;

public interface UserService {
    void registerUser(UserVO userVO);
    UserVO login(UserVO userVO);
}
