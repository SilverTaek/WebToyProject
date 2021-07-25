package com.ssafy.coach5.web;

import com.ssafy.coach5.domain.posts.Posts;
import com.ssafy.coach5.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostsController {

    private final PostsService postsService;

    public void save(@RequestBody Posts posts){
        postsService.save(posts);
        
    }
}
