package mum.edu.alphabetstore.repository;

import mum.edu.alphabetstore.domain.Authority;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends CrudRepository<Authority, Long>{

}
