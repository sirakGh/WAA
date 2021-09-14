package com.efrem.demosep03.controller;

import com.efrem.demosep03.domain.Post;
import com.efrem.demosep03.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/test")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping
    public List<Post> getAll() {
        return postService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Post> findById(@PathVariable("id") int id) {
        return postService.findById(id);
    }

    @PostMapping
    public void add(@RequestBody Post post) {
        postService.add(post);
    }

    @DeleteMapping("/{id}")
    public Post delete(@PathVariable("id") long id) {
        return postService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Post post) {
        postService.save(post);
    }
}

