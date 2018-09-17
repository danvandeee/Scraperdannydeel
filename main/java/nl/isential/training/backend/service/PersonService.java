package nl.isential.training.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import nl.isential.training.backend.dao.IPersonDAO;
import nl.isential.training.backend.model.Person;

@Service
public class PersonService implements IPersonService {

	@Autowired
	private IPersonDAO iPersonDAO;
	
	
	public List<Person> findByLastName(String lastName ) {
		return this.iPersonDAO.findByLastName(lastName);
	}

	@Override
	public Optional<Person> findOne(Long id) {
		if (id < 0)
			return Optional.empty();

		return this.iPersonDAO.findById(id);
	}

	@Override
	public List<Person> findAll() {
		return this.iPersonDAO.findAll();
	}

	@Override
	public Person create(Person person) {
		Assert.notNull(person, "Person may not be null");

		return this.iPersonDAO.save(person);
	}

	@Override
	public void update(Person person) {
		Assert.notNull(person, "Person may not be null");

		this.iPersonDAO.save(person);
	}

	@Override
	public void delete(Person person) {
		Assert.notNull(person, "Person may not be null");

		this.iPersonDAO.delete(person);
	}

	@Override
	public List<Person> findUnderCertainAge(int age) {
		if (age < 0)
			return new ArrayList<>();

		return this.iPersonDAO.findUnderCertainAge(age);
	}
	
	@Override
	public List<Person> findByName(String name) {
		if (name == null || name.isEmpty())
			return this.iPersonDAO.findAll();
		
		return this.iPersonDAO.findByNameStartsWith(name);
	}

}