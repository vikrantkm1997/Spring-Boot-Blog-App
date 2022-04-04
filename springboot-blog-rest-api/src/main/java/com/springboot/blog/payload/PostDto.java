package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
public class PostDto {

    private long id;

    //Setting constraint -1. Tile should not be empty -2. The title should have atleast 2 characters
    @NotEmpty
    @Size(min=2, message="Post title should have atleast 2 characters")
    private String title;

    //Setting constraint -1. description should not be empty -2. The description should have atleast 10 characters
    @NotEmpty
    @Size(min=10, message="The description should have atleast 10 characters")
    private String description;

    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
}
