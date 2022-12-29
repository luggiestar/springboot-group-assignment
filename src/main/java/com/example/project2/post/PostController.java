package com.example.project2.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/post")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }
    @GetMapping
    public List<Post> getPosts() {
        return this.postService.getPosts();
    }

    @PostMapping
    public void savePost(@RequestBody Post post) {
        postService.savePost(post);
    }
}
