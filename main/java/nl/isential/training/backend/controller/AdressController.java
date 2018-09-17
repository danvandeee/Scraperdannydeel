package nl.isential.training.backend.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.isential.training.backend.model.Address;
import nl.isential.training.backend.model.Person;
import nl.isential.training.backend.service.IAddressService;
import nl.isential.training.backend.service.IPersonService;
import nl.isential.training.dto.AddressDTO;
import nl.isential.training.dto.PersonDTO;

@RestController
public class AdressController {

	@Autowired
	private IAddressService iadressService;
	
	@Autowired
	private IPersonService ipersonservice;
	
	@PostMapping("/api/adress/")
	public Address create(@RequestBody AddressDTO adressdto) {
		
		Address address = new Address();
		address.setCity(adressdto.getCity());
		address.setId(adressdto.getId());
		address.setCountry(adressdto.getCountry());
		address.setPostcode(adressdto.getPostcode());
		address.setHouseNumber(adressdto.getHouseNumber());
		address.setStreet(adressdto.getStreet());
		address.setPerson(null);
		//dit stuk moet nog aangepast worden met getid
		/*
		Optional<Person> optional = this.ipersonservice.findOne(adressdto.getId());
		if (optional.isPresent()) {
		address.setPerson(optional.get());
		} else {
			address.setPerson(null);
		}
		*/
		//address.setPerson(((Person) this.ipersonservice.findOne(adressdto.getPersonid())));
		
		
		return this.iadressService.create(address);
		
		//return this.iadressService.create(adress);
	}
	
	@GetMapping("/api/adress/all")
	public List<Address> findAll() {
		
		List<AddressDTO> addressDTOList = new ArrayList<AddressDTO>();
		
		/*
		for (Address adress : this.iadressService.findAll()) {
			AddressDTO addressDTO = new AddressDTO();
			addressDTO.setId(adress.getId());
			addressDTO.setCity(adress.getCity());
			addressDTO.setHouseNumber(adress.getHouseNumber());
			addressDTO.setPersonid(adress.getPerson().getId());
			addressDTO.setCountry(adress.getCountry());
			addressDTO.setPostcode(adress.getPostcode());
			addressDTO.setStreet(adress.getStreet());
			
			
			
		/*
		for (Person persono : this.ipersonservice.findAll()) {
			if (persono.getId().equals(adress.getPerson().getId())) {
				addressDTO.setPerson(persono);	
			}
			
		} //end for loop person persono
		*/
		
	//	} //end for loop Adress adress
		//return addressDTOList;
		
	
	
		return this.iadressService.findAll();
	}
	
	@GetMapping("/api/adress/all2")
	public List<AddressDTO> findAll2() {
		
		List<AddressDTO> addressDTOList = new ArrayList<AddressDTO>();
		
		
		for (Address adress : this.iadressService.findAll()) {
			AddressDTO addressDTO = new AddressDTO();
			addressDTO.setId(adress.getId());
			addressDTO.setCity(adress.getCity());
			addressDTO.setHouseNumber(adress.getHouseNumber());
			//addressDTO.setPersonid(adress.getPerson().getId());
			addressDTO.setCountry(adress.getCountry());
			addressDTO.setPostcode(adress.getPostcode());
			addressDTO.setStreet(adress.getStreet());
			addressDTOList.add(addressDTO);
			
			
		
		for (Person persono : this.ipersonservice.findAll()) {
			if (persono.getId().equals(1L)) {
				addressDTO.setPerson(persono);	
			}
			
		} //end for loop person persono
		
		
		} //end for loop Adress adress
		return addressDTOList;
		
	
	
		//return this.iadressService.findAll();
	}
	
	
	
	
}
