package Lab5.Demo.SpringBootApplication.service;

import Lab5.Demo.SpringBootApplication.model.Post;
import Lab5.Demo.SpringBootApplication.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> getAllPost() {
        return postRepository.getAllPost();
    }

    @Override
    public void addPost(Post post) {
        postRepository.save(post);
    }

    @Override
    public Optional<Post> getPostById(long id) {
        return postRepository.findById(id);
    }

    @Override
    public void removePost(long id) {
        postRepository.deleteById(id);
    }
}
