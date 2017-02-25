package mum.edu.alphabetstore.repository;

import mum.edu.alphabetstore.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	@Query("select u from USERS u where u.userCredentials.username=:username")
	User findUserByUsername(@Param("username") String username);
}
