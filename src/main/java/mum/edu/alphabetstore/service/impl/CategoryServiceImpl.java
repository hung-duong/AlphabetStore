																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													package mum.edu.alphabetstore.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.alphabetstore.domain.Category;
import mum.edu.alphabetstore.domain.Product;
import mum.edu.alphabetstore.repository.CategoryRepository;
import mum.edu.alphabetstore.repository.ProductRepository;
import mum.edu.alphabetstore.service.CategoryService;
import mum.edu.alphabetstore.service.ProductService;


@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return (List<Category>)categoryRepository.findAll();
	}

	@Override
	public Category getCategoryByName(String categoryName) {
		
		return categoryRepository.findOne(categoryName);
	}

	@Override
	public void addCategory(Category category) {
		categoryRepository.save(category);
		
	}

	
}
