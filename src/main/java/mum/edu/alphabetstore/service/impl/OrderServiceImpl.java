package mum.edu.alphabetstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.alphabetstore.domain.Orders;
import mum.edu.alphabetstore.domain.Product;
import mum.edu.alphabetstore.repository.OrderRepository;
import mum.edu.alphabetstore.repository.ProductRepository;
import mum.edu.alphabetstore.service.CartService;
import mum.edu.alphabetstore.service.OrderService;


@Service
@Transactional
public class OrderServiceImpl implements OrderService{

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CartService cartService;

	
	public void processOrder(String productId, long quantity) {
		Product productById = productRepository.findOne(productId);
		
		if(productById.getUnitsInStock() < quantity){
			throw new IllegalArgumentException("Out of Stock. Available Units in stock"+ productById.getUnitsInStock());
		}
		
		productById.setUnitsInStock(productById.getUnitsInStock() - quantity);
	}
	

	
	public Long saveOrder(Orders order) {
		Orders o= orderRepository.save(order);
		cartService.delete(order.getCart().getCartId());
		return o.getId();
	}

}
