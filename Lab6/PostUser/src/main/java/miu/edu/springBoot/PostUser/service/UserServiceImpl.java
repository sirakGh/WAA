package miu.edu.springBoot.PostUser.service;

import miu.edu.springBoot.PostUser.domain.User;
import miu.edu.springBoot.PostUser.domain.Post;
import miu.edu.springBoot.PostUser.repository.UserRepository;
import miu.edu.springBoot.PostUser.repository.postRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;
    @Autowired
    postRepository postrepository;

    @Override
    public List<User> getAll(){
        return (List<User>) userRepository.findAll();
    }
    @Override
    public Optional<User> getById(long id){
        return userRepository.findById(id);
    }
    @Override
    public void addUser(User user){
        userRepository.save(user);
    }
    @Override
    public List<Post> getPosts(long id ){
        return userRepository.getPostsByUserId(id);
    }
    @Override
    public void addPosts(long userid , long postid){
        User u = userRepository.findById(userid).get();
        u.getPosts().add(postrepository.getById(postid).get());
        userRepository.save(u);

    }
    @Override
    public List<User> getUsersWithPostsmoreThan1(){
        return userRepository.getUserspostmore1();
    }





}
