package Lab4.Demo.SpringBootApplication.controller;

import Lab4.Demo.SpringBootApplication.model.Post;
import Lab4.Demo.SpringBootApplication.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }

    @GetMapping("/{id}")
    public Optional<Post> findById(@PathVariable Long id){
        return postService.getPostById(id);
    }


    @PostMapping("/add")
    public void addPost(@RequestBody Post post){
        postService.addPost(post);
        System.out.println("Added Successfully");
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable("id") Long id){
        postService.removePost(id);
    }
}
