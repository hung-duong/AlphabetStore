package mum.edu.alphabetstore.service;

import mum.edu.alphabetstore.domain.Category;

import java.util.List;


public interface CategoryService {

	List<Category> getAllCategory();

	Category getCategoryByName(String categoryName);
	

	void addCategory(Category category);
}
