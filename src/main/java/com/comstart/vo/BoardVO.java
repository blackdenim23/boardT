package com.comstart.vo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data // getter, setter, toString, equals, hashCode 등 자동 생성
@NoArgsConstructor // 기본 생성자       
@AllArgsConstructor // 모든 필드를 매개변수로 받는 생성자

public class BoardVO {
    private Long id;
    private String title;
    private String content;
    private String writerId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt; 
    
}
