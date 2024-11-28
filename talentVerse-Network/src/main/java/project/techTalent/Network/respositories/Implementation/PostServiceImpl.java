package project.talentVerse.Network.respositories.Implementation;

import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.talentVerse.Network.entities.Category;
import project.talentVerse.Network.entities.Post;
import project.talentVerse.Network.entities.User;
import project.talentVerse.Network.exceptions.ResourceNotFoundException;
import project.talentVerse.Network.payloads.PostDto;
import project.talentVerse.Network.payloads.UserDto;
import project.talentVerse.Network.respositories.CategoryRepo;
import project.talentVerse.Network.respositories.PostRepo;
import project.talentVerse.Network.respositories.UserRepo;
import project.talentVerse.Network.services.PostService;

@Service
public class PostServiceImpl implements PostService
{
	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	

	@Override
	public PostDto createPost(PostDto postDto, Integer userId, Integer categoryId) {
		
		User user = this.userRepo.findById(userId).
				orElseThrow(() -> new ResourceNotFoundException("User","user Id",userId));
		
		Category category = this.categoryRepo.findById(categoryId).
				orElseThrow(()-> new  ResourceNotFoundException("Category","category Id", categoryId));
		
		Post post = this.modelMapper.map(postDto, Post.class);
		post.setImageName("default.jpg");
		post.setAddedDate(new Date());
		post.setUser(user);
		post.setCategory(category);
		Post createdPost = this.postRepo.save(post);
		
		return this.modelMapper.map(createdPost, PostDto.class);
	}

	@Override
	public Post updatePost(PostDto postDto, Integer postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post getPost(Integer postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getAllpost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePost(Integer postId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Post> getPostsByUser(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getPostsByCategory(Integer categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> searchPosts(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
