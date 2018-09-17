package nl.isential.training.backend.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import nl.isential.training.backend.model.Person;
import java.lang.String;

public interface IPersonDAO extends CrudRepository<Person, Long> {

	@Override
	public List<Person> findAll();

	public List<Person> findByNameStartsWith(String name);
	
	List<Person> findByLastName(String lastname);
	
	

	@Query("SELECT p FROM Person p WHERE p.age < :age")
	public List<Person> findUnderCertainAge(@Param("age") int ageArgs);

}