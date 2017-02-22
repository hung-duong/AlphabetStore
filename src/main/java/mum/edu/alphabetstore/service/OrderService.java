package mum.edu.alphabetstore.service;

import mum.edu.alphabetstore.domain.Orders;

public interface OrderService {
	
	void processOrder(String  productId, long quantity);
	
	Long saveOrder(Orders order);
}
