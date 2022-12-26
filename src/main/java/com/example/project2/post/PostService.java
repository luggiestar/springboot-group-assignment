package com.example.project2.post;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class PostService {

    @GetMapping
    public List<Post> getPosts() {
        return List.of(
                new Post(
                        1L,
                        "Song",
                        "Write"
                )
        );
    }
}
