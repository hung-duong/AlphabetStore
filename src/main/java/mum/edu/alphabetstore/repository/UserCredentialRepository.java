package mum.edu.alphabetstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.alphabetstore.domain.UserCredentials;

@Repository
public interface UserCredentialRepository extends CrudRepository<UserCredentials, String>{

}
