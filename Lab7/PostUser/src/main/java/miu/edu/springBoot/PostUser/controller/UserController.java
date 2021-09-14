package miu.edu.springBoot.PostUser.controller;



import miu.edu.springBoot.PostUser.domain.User;
import miu.edu.springBoot.PostUser.domain.Post;
import miu.edu.springBoot.PostUser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    public List<User> getAllUsers(){return userService.getAll();}

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable long id ){return userService.getById(id);}

    @PostMapping
    public void AddUser(@RequestBody User u){userService.addUser(u);}

    @GetMapping("/{id}/posts")
    public List<Post> getPosts(@PathVariable long id){return userService.getPosts(id);}


    @PutMapping("/{userid}/posts/{postid}")
    public void AddPosts(@PathVariable long userid , @PathVariable long postid){userService.addPosts(userid , postid);}

    @GetMapping("/morethanonepost")
    public List<User> getUsersWithPostsmoreThan1(){return userService.getUsersWithPostsmoreThan1();}


}
