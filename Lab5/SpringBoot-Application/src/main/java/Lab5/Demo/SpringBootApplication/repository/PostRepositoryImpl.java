//package Lab4.Demo.SpringBootApplication.repository;
//
//import Lab4.Demo.SpringBootApplication.model.Post;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class PostRepositoryImpl implements PostRepository{
//
//    List<Post> posts = new ArrayList<>(Arrays.asList(
//            new Post(101L, "Covid-19 Update", "New Covid Variant hits US", "Sirak"),
//            new Post(102L, "Book called Nateba do zareba official", "Book Celebration", "John"),
//            new Post(103L, "Utopia Park will be Modified", "Fairfield Iowa", "Awet"),
//            new Post(104L, "Storm hits many states", "Ida hits Vargina", "Bruke"),
//            new Post(105L, "TPLF control the capital city of Tigray Mekele", "TPLF control Mekele", "Medhanie")
//            ));
//
//    @Override
//    public List<Post> getAllPost() {
//        return posts;
//    }
//
//    @Override
//    public void addPost(Post post) {
//        posts.add(post);
//    }
//
//    @Override
//    public Optional<Post> getPostById(long id) {
//        Optional x = posts.stream()
//                .filter(a-> a.getId()== id)
//                .findAny();
//        return x;
//    }
//
//    @Override
//    public Post removePost(long id) {
//        for (Post post: posts){
//            if(post.getId()==id){
//                posts.remove(post);
//                return post;
//            }
//        }
//        return null;
//    }
//}
