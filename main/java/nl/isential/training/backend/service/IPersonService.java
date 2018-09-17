package nl.isential.training.backend.service;

import java.util.List;
import java.util.Optional;

import nl.isential.training.backend.model.Person;

public interface IPersonService {

	public List<Person> findByLastName(String lastName );
	
	public Optional<Person> findOne(Long id);

	public List<Person> findAll();

	public Person create(Person person);

	public void update(Person person);

	public void delete(Person person);

	public List<Person> findUnderCertainAge(int age);
	
	public List<Person> findByName(String name);
	
	

}