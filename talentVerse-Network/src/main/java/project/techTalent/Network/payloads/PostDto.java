package project.talentVerse.Network.payloads;

import java.util.Date;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.talentVerse.Network.entities.Category;
import project.talentVerse.Network.entities.User;
@Getter
@Setter
@NoArgsConstructor
public class PostDto
{
	private String title;
	
	private String content;
	private String imageName;
	private Date addedDate;
	
	// while returning post we get category, user
	private CategoryDto category;
	private UserDto user;

}
