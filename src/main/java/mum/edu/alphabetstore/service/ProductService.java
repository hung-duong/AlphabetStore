package mum.edu.alphabetstore.service;

import mum.edu.alphabetstore.domain.Product;

import java.util.List;


public interface ProductService {

	List<Product> getAllProducts();

	Product getProductById(String productID);
	
	List<Product> getProductsByCategory(String category);

//	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
	
	void addProduct(Product product);

	void deleteProduct(String id);
	
	//newest products
	List<Product> findProductsByDate();
	
	//lowest price products
	List<Product> findProductsByPrice();
}
