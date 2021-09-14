package Lab4.Demo.SpringBootApplication.repository;

import Lab4.Demo.SpringBootApplication.model.Post;

import java.util.List;
import java.util.Optional;


public interface PostRepository {

    List<Post> getAllPost();
    void addPost(Post post);
    Optional<Post> getPostById(long id );
    void removePost(long id );
}
