package org.example.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor // 모든 값을 파라미터로 받는 생성자 추가
@Getter
public class UpdateArticleRequest {
    private String title;
    private String content;
}