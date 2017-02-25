package mum.edu.alphabetstore.repository;

import mum.edu.alphabetstore.domain.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends  CrudRepository<Cart,String>{


}
