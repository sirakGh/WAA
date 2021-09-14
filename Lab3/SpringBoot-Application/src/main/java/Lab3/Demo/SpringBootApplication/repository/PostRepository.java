package Lab3.Demo.SpringBootApplication.repository;

import Lab3.Demo.SpringBootApplication.model.Post;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface PostRepository {

    List<Post> getAllPost();
    void addPost(Post post);
    Optional<Post> getPostById(long id );
    void removePost(long id );
}
