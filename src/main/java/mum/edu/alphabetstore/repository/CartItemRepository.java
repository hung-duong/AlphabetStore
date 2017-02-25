package mum.edu.alphabetstore.repository;

import mum.edu.alphabetstore.domain.CartItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends  CrudRepository<CartItem,Integer>{


}
