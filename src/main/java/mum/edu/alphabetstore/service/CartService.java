package mum.edu.alphabetstore.service;

import mum.edu.alphabetstore.domain.Cart;
import mum.edu.alphabetstore.domain.CartItem;

public interface CartService {
	
	Cart create(Cart cart);
	
	Cart read(String cartId);
	
	Cart update(String productId, int quantity,  Cart cart);
	
	Cart removeCartItem(String cartItemId, Cart cart);
	
	void delete(String cartId);

	Cart validate(String cartId);
	


}
