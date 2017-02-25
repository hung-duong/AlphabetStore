package mum.edu.alphabetstore.repository;


import mum.edu.alphabetstore.domain.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Long> {

}
