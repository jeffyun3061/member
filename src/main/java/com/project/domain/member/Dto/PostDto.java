package com.project.domain.member.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDto {
    private String title;
    private String content;
    private Long memberId;
    // Additional fields as needed
}