package miu.edu.springBoot.PostUser.service;


import miu.edu.springBoot.PostUser.domain.Post;
import miu.edu.springBoot.PostUser.repository.postRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PostServiceImpl implements PostService {
    @Autowired
    postRepository postrepository;

    @Override
    public List<Post> getAll(){
        return postrepository.findAll();
    }
    @Override
    public Optional<Post> getById(long id){
        return postrepository.getById(id);
    }
    @Override
    public void addPost(Post p){
        postrepository.save(p);
    }



    public void removePost(long id ){
        postrepository.deleteById(id);
    }
}
