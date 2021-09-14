package Lab3.Demo.SpringBootApplication.repository;

import Lab3.Demo.SpringBootApplication.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class PostRepositoryImpl implements PostRepository{

    List<Post> posts = new ArrayList<>(Arrays.asList(
            new Post(101L, "Covid-19 Update", "New Covid Variant hits US", "Sirak"),
            new Post(102L, "Taliban Control Afghanistan", "Taliban hits Kabul", "John")
            ));

    @Override
    public List<Post> getAllPost() {
        return posts;
    }

    @Override
    public void addPost(Post post) {

    }

    @Override
    public Optional<Post> getPostById(long id) {
        Optional x = posts.stream()
                .filter(a-> a.getId()== id)
                .findAny();
        return x;
    }

    @Override
    public void removePost(long id) {

    }
}
