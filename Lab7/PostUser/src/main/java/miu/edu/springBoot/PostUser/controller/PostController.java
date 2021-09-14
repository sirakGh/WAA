package miu.edu.springBoot.PostUser.controller;

import miu.edu.springBoot.PostUser.domain.Post;
import miu.edu.springBoot.PostUser.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
@CrossOrigin
public class PostController {
    @Autowired
    PostService postservice;

    @GetMapping
    public List<Post> getAll(){
        return postservice.getAll();
    }

    @PostMapping
    public void addPost(@RequestBody Post post){
        postservice.addPost(post);

    }

    @GetMapping("/{id}")
    public Optional<Post> getByid(@PathVariable long id){
        return postservice.getById(id);
    }

    @DeleteMapping("/{id}")
    public void removePost(@PathVariable long id){
        System.out.println("called");
        postservice.removePost(id);
    }



}
