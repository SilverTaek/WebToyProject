package com.ssafy.coach5.domain.posts;

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
