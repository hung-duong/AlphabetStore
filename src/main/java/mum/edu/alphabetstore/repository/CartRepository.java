package mum.edu.alphabetstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.alphabetstore.domain.Cart;

@Repository
public interface CartRepository extends  CrudRepository<Cart,String>{


}
