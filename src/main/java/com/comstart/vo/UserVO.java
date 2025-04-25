package com.comstart.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data // getter, setter, toString, equals, hashCode 등 자동 생성
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor
public class UserVO {
    private String userId;
    private String username;
    private String password;
    private String email;
    private String role;
}
