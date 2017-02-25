package mum.edu.alphabetstore.service.impl;

import mum.edu.alphabetstore.domain.Product;
import mum.edu.alphabetstore.repository.ProductRepository;
import mum.edu.alphabetstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		List<Product> products= (List<Product>) productRepository.findAll();
		
		return products;
	}

	public Product getProductById(String productID) {
		return productRepository.findOne(productID);
	}
	
	public List<Product> getProductsByCategory(String category) {
	  
		return productRepository.getProductsByCategory(category);
	
	}

//	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
//		return productRepository.getProductsByFilter(filterParams);
//	}
	
	public void addProduct(Product product) {
		   productRepository.save(product);
	}
	
	//find the newest products
	public List<Product> findProductsByDate(){
		return productRepository.findProductsByDate();
	}
	
	//find the products by price
	public List<Product> findProductsByPrice(){
		return productRepository.findProductsByPrice();
	}

	@Override
	public void deleteProduct(String id) {
		productRepository.delete(id);
		
	}

}
