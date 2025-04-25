package com.comstart.controller;

import java.util.List;
import com.comstart.service.post.PostService;   
import com.comstart.vo.BoardVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;    

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<BoardVO> getAllPosts() {
        return postService.getAllPosts();
    }
}