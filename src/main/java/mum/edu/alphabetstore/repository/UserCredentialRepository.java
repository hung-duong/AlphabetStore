package mum.edu.alphabetstore.repository;

import mum.edu.alphabetstore.domain.UserCredentials;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCredentialRepository extends CrudRepository<UserCredentials, String>{

}
