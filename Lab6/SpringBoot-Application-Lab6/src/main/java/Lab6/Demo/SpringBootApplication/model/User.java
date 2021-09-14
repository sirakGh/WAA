package Lab6.Demo.SpringBootApplication.model;

import java.util.List;
import Lab6.Demo.SpringBootApplication.model.Post;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Entity
public class User {

    @Id
    private long id;
    private String name;
    private List<Post> post;

}
