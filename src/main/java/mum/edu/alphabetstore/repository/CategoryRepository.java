package mum.edu.alphabetstore.repository;

import mum.edu.alphabetstore.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, String> {

	

}
