package com.ssafy.coach5.service;

import com.ssafy.coach5.domain.posts.Posts;
import com.ssafy.coach5.domain.posts.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    public void save(Posts posts){

        postsRepository.save(posts);
    }
}
