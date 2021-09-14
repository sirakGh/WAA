package com.efrem.demosep03.repository;

import com.efrem.demosep03.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class PostRepositoryImpl implements PostRepository{
    List<Post> posts = new ArrayList<>(Arrays.asList(
            new Post(1, "Christiano", "Transfered to United", "NYTimes"),
            new Post(2, "MacBook Pro", "New Release Day set", "WashingtonPost")
    ));

    @Override
    public List<Post> getAll() {
        return posts;
    }

    @Override
    public Optional<Post> findById(int id) {
        return posts.stream()
                .filter(p -> p.getId() == id)
                .findFirst();
    }

    @Override
    public void add(Post post) {
        posts.add(post);
    }

    @Override
    public Post delete(long id) {
        for (Post ps : posts){
            if(ps.getId()== id){
                posts.remove(ps);
                return ps;
            }
        }
        return null;
    }

    @Override
    public void save(Post post) {
        for(Post ps : posts){
            if(ps.getId()==post.getId()){
                posts.remove(ps);
                posts.add(post);
            }
        }
    }
}
