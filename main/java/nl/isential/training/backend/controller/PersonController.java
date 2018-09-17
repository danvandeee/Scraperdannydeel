package nl.isential.training.backend.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.isential.training.backend.model.Address;
import nl.isential.training.backend.model.Person;
import nl.isential.training.backend.service.IAddressService;
import nl.isential.training.backend.service.IPersonService;
import nl.isential.training.dto.PersonDTO;

@RestController
public class PersonController {

	@Autowired
	private IPersonService iPersonService;
	
	@Autowired
	private IAddressService iadressService;

	@GetMapping("/api/person/{id}")
	public PersonDTO findById(@PathVariable Long id) {
		Optional<Person> optional = this.iPersonService.findOne(id);

		if (optional.isPresent()) {
			
		PersonDTO personDTO = new PersonDTO();
		personDTO.setId(optional.get().getId());
		personDTO.setName(optional.get().getName());
		personDTO.setAge(optional.get().getAge());
			return personDTO;
			//return optional.get();
		}
		return null;
	}

	@GetMapping("/api/person/last/{name}")
	public List<Person> findByLastName(@PathVariable String name) {
		return this.iPersonService.findByLastName(name);
	}
	
	@GetMapping("/api/person/all")
	public List<PersonDTO> findAll() {
		
		List<PersonDTO> personDTO = new ArrayList<PersonDTO>();
		
		for (Person persono : this.iPersonService.findAll()) {
			PersonDTO jantje = new PersonDTO();
			jantje.setId(persono.getId());
			jantje.setName(persono.getName());
			jantje.setLastName(persono.getLastName());
			jantje.setAddresses(persono.getAddresses());
			jantje.setAge(persono.getAge());
			personDTO.add(jantje);
		}
		
		return personDTO;
		
		//return this.iPersonService.findAll();
	}

	// @RequestMapping(method=RequestMethod.POST, path="/api/person")
	@PostMapping("/api/person")
	public Person create(@RequestBody PersonDTO person) {
		
		Person persono = new Person();
		ArrayList<Address> adressos = new ArrayList<Address>();
		
		persono.setAge(person.getAge());
		persono.setId(person.getId());
		persono.setLastName(person.getLastName());
		persono.setName(person.getName());
		
		
		for (Address address :  this.iadressService.findAll()) {
			
		}
		
		if (adressos.isEmpty()) {
		persono.setAddresses(null);
		} else {
		persono.setAddresses(adressos);
		}
		
		System.out.println("dannymessage: error net voor de return?" );
		return this.iPersonService.create(persono);
	}

	@PutMapping("/api/person/{id}")
	public boolean update(@PathVariable Long id, @RequestBody Person person) {
		this.iPersonService.update(person);

		return true;
	}

	@DeleteMapping("/api/person/{id}")
	public boolean delete(@PathVariable Long id) {
		Optional<Person> optional = this.iPersonService.findOne(id);
		if (optional.isPresent()) {
			this.iPersonService.delete(optional.get());

			return true;
		}

		return false;
	}

	@GetMapping("/api/person/under/{age}")
	public List<Person> findUnderCertainAge( @PathVariable int age ) {
		return this.iPersonService.findUnderCertainAge(age);
	}

	@GetMapping("/api/person/name/{name}")
	public List<Person> findByName( @PathVariable String name ) {
		return this.iPersonService.findByName(name);
	}
	
}