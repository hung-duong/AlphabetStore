package mum.edu.alphabetstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.alphabetstore.domain.Authority;

@Repository
public interface AuthorityRepository extends CrudRepository<Authority, Long>{

}
