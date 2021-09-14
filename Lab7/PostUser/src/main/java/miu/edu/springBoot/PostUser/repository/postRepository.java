package miu.edu.springBoot.PostUser.repository;


import miu.edu.springBoot.PostUser.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface postRepository extends CrudRepository<Post,Long> {
    public List<Post> findAll();
    public Post save(Post p);
    public Optional<Post> getById(long id );
    public void deleteById(long id );
}
