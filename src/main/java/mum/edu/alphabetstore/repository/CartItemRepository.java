package mum.edu.alphabetstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.alphabetstore.domain.CartItem;

@Repository
public interface CartItemRepository extends  CrudRepository<CartItem,Integer>{


}
