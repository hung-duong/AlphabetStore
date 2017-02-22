package mum.edu.alphabetstore.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import mum.edu.alphabetstore.domain.Category;
import mum.edu.alphabetstore.domain.Product;


public interface CategoryService {

	List<Category> getAllCategory();

	Category getCategoryByName(String categoryName);
	

	void addCategory(Category category);
}
