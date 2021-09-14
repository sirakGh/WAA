package Lab3.Demo.SpringBootApplication.controller;

import Lab3.Demo.SpringBootApplication.model.Post;
import Lab3.Demo.SpringBootApplication.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller

public class PostController {
    @Autowired
    PostService postService;

    @GetMapping("/allpost")
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }

    @PostMapping("/add")
    public void addPost(@RequestBody Post post){
        postService.addPost(post);
        System.out.println("Added Successfully");
    }

    @GetMapping("/{id}")
    public Optional<Post> findById(@PathVariable Long id){
         return postService.getPostById(id);
    }

    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable Long id){
        postService.removePost(id);
        return "Deleted Succefully";
    }
}
