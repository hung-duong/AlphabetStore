package mum.edu.alphabetstore.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mum.edu.alphabetstore.domain.Category;
import mum.edu.alphabetstore.domain.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, String> {

	

}
