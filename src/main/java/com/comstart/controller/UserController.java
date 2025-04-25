package com.comstart.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comstart.service.user.UserService;
import com.comstart.vo.UserVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    
    private final UserService userService;

    @GetMapping("/test")
    public String test() {
        return "보안 없이 접근 성공!";
    }
    
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserVO userVO) {
        userService.registerUser(userVO);
        return ResponseEntity.ok("회원가입 완료");
    }

    @PostMapping("/login")
    public ResponseEntity<UserVO> login(@RequestBody UserVO userVO) {
        UserVO loginUser = userService.login(userVO);
        if (loginUser != null) {
            return ResponseEntity.ok(loginUser);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
    
}
