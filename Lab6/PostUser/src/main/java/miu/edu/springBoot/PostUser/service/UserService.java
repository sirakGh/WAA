package miu.edu.springBoot.PostUser.service;


import miu.edu.springBoot.PostUser.domain.User;
import miu.edu.springBoot.PostUser.domain.Post;

import java.util.List;
import java.util.Optional;


public interface UserService {


    public List<User> getAll();
    public Optional<User> getById(long id);
    public void addUser(User user);
    public List<Post> getPosts(long id );
    public void addPosts(long userid , long postid);
    public List<User> getUsersWithPostsmoreThan1();
}
