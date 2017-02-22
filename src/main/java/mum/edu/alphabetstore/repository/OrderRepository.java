package mum.edu.alphabetstore.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.alphabetstore.domain.Orders;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Long> {

}
