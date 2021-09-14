package com.efrem.demosep03.repository;

import com.efrem.demosep03.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {

    public List<Post> getAll();
    public Optional<Post> findById(int id);
    public void add(Post post);
    public Post delete(long id);

   public void save(Post post);
}
