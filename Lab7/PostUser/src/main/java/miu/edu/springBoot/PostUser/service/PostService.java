package miu.edu.springBoot.PostUser.service;

;
import miu.edu.springBoot.PostUser.domain.Post;


import java.util.List;
import java.util.Optional;

public interface PostService {
    public List<Post> getAll();
    public void addPost(Post p);
    public Optional<Post> getById(long id);
    public void removePost(long id );
}
