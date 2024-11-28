package project.talentVerse.Network.respositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.talentVerse.Network.entities.Category;
import project.talentVerse.Network.entities.Post;
import project.talentVerse.Network.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>
{
   List<Post> findByUser(User user);
   List<Category> findByCategory(Category category);
}
