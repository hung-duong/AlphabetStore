package mum.edu.alphabetstore.service.impl;

import mum.edu.alphabetstore.domain.Cart;
import mum.edu.alphabetstore.domain.CartItem;
import mum.edu.alphabetstore.domain.Product;
import mum.edu.alphabetstore.exception.InvalidCartException;
import mum.edu.alphabetstore.exception.ProductNotFoundException;
import mum.edu.alphabetstore.repository.CartItemRepository;
import mum.edu.alphabetstore.repository.CartRepository;
import mum.edu.alphabetstore.service.CartService;
import mum.edu.alphabetstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;


@Service
@Transactional
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private CartItemRepository cartItemRepository;


	@Autowired
	private ProductService productService ;
	
	public Cart create(Cart cart) {
		return cartRepository.save(cart);
	}

	public Cart read(String cartId) {
		return cartRepository.findOne(cartId);
	}


	public Cart update(String productId, int quantity, Cart cart) {

		boolean isNewProduct=true;
		for(CartItem cartItem: cart.getCartItems()){
			if(cartItem.getProduct().getProductId().equals(productId)){
				cartItem.setQuantity(cartItem.getQuantity()+ quantity);
				isNewProduct=false;
			}
			
		}
		if(isNewProduct){
			Product product = productService.getProductById(productId);
			if(product == null) {
				throw new IllegalArgumentException(new ProductNotFoundException(productId,null));
			}
			CartItem cartItem=new CartItem(product,quantity);
			cart.addCartItem(cartItem);
		}
		
		return cartRepository.save(cart);
	}


	public void delete(String cartId) {
		cartRepository.delete(cartId);
		
	}

	@Override
	public Cart removeCartItem(String cartItemId, Cart cart) {

		Iterator<CartItem> i = cart.getCartItems().iterator();
		while (i.hasNext()) {
			CartItem item = i.next();
			if (item.getId().equals(cartItemId)) {
				i.remove();
			}
		}
		cart.updateGrandTotal();
		return cartRepository.save(cart);
	}

	@Override
	public Cart validate(String cartId) {
		Cart cart = cartRepository.findOne(cartId);
		if(cart==null || cart.getCartItems().size()==0) {
			throw new InvalidCartException(cartId);
		}
		return cart;
	}


}
