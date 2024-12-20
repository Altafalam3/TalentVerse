package project.talentVerse.Network.services;

import java.util.List;

import project.talentVerse.Network.payloads.CategoryDto;

public interface CategoryService
{
	//create
	CategoryDto createCategory(CategoryDto categoryDto);
    //update
	CategoryDto updateCategory(CategoryDto categoryDto , Integer categoryId);
	//delete
	void deleteCategory(Integer categoryId);
	//getSingle Category
	CategoryDto getCategory( Integer categoryId);
	//getAllCategory
	
	List<CategoryDto> getAllCategory( );
}
