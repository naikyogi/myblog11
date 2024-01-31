package com.myblog.myblog11.service;

import com.myblog.myblog11.payload.PostDto;

public interface PostService {

    default PostDto createPost(PostDto postDto) {
        return postDto;
    }
}
