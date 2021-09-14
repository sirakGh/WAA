package Lab4.Demo.SpringBootApplication.service;

import Lab4.Demo.SpringBootApplication.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PostService {

     List<Post> getAllPost();

     void addPost(Post post);

     Optional<Post> getPostById(long id);

     void removePost(long id );
}
