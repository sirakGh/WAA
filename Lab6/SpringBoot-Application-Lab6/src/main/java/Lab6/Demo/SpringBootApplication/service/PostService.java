package Lab5.Demo.SpringBootApplication.service;

import Lab5.Demo.SpringBootApplication.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface PostService {

     List<Post> getAllPost();

     void addPost(Post post);

     Optional<Post> getPostById(long id);

     void removePost(long id );
}
