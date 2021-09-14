package Lab3.Demo.SpringBootApplication.service;

import Lab3.Demo.SpringBootApplication.model.Post;
import Lab3.Demo.SpringBootApplication.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> getAllPost() {
        return postRepository.getAllPost();
    }

    @Override
    public void addPost(Post post) {
        postRepository.addPost(post);
    }

    @Override
    public Optional<Post> getPostById(long id) {
        return postRepository.getPostById(id);
    }

    @Override
    public void removePost(long id) {
        postRepository.removePost(id);
    }
}
