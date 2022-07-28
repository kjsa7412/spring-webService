package com.kjsa.springwebservice.domain.posts;

import lombok.Getter;

@Getter
public class PostsMainResponseDto {
    private Long id;
    private String title;
    private String author;

    public PostsMainResponseDto(Posts entity){
        id = entity.getId();
        title = entity.getTitle();
        author = entity.getAuthor();
    }
}
