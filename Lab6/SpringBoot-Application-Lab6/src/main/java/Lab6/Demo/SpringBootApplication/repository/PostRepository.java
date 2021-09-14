package Lab5.Demo.SpringBootApplication.repository;

import Lab5.Demo.SpringBootApplication.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    public List<Post> getAllPost();

    public void addPost(Post post);

    public Optional<Post> findById(long id );

//  public Post removePost(long id );

}
