package mum.edu.alphabetstore.repository;

import mum.edu.alphabetstore.domain.CreditCard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends CrudRepository<CreditCard, Long>{
    @Query("select c from CreditCard c where c.number=:number")
	public CreditCard findCreditCardByNumber(@Param("number") String number);
}
