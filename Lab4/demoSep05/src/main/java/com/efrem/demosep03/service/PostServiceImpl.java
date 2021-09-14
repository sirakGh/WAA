package com.efrem.demosep03.service;

import com.efrem.demosep03.domain.Post;
import com.efrem.demosep03.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> getAll() {
        return postRepository.getAll();
    }

    @Override
    public Optional<Post> findById(int id) {
        return postRepository.findById(id);
    }

    @Override
    public void add(Post post) {
        postRepository.add(post);
    }

    @Override
    public Post delete(long id) {
        return postRepository.delete(id);
    }

    @Override
    public void save(Post post) {

        postRepository.save(post );
    }
}
