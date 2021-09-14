package miu.edu.springBoot.PostUser.repository;


import miu.edu.springBoot.PostUser.domain.User;
import miu.edu.springBoot.PostUser.domain.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {

    @Query("select u.posts from User u where u.id = :id")
    public List<Post> getPostsByUserId(long id);


    @Query("select u From User u where u.posts.size>1")
    public List<User> getUserspostmore1();


}
