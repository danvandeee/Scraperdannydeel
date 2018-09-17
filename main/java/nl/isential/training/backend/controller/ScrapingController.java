package nl.isential.training.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.isential.training.backend.model.Person;
import nl.isential.training.backend.model.Scrapingmodel;
import nl.isential.training.backend.service.IDannyScrapeTestApplicationService;
import nl.isential.training.backend.service.IPersonService;
import nl.isential.training.dto.PersonDTO;
import nl.isential.training.dto.ScraperDTO;

@RestController
public class ScrapingController {

	@Autowired
	private IDannyScrapeTestApplicationService idannyScrapeTestservice;
	
	@GetMapping("/api/person/all")
	public List<ScraperDTO> findAll() {
		
		List<ScraperDTO> personDTO = new ArrayList<ScraperDTO>();
		
		for (Scrapingmodel scraper : this.idannyScrapeTestservice.findAll()) {
			PersonDTO jantje = new PersonDTO();
			jantje.setId(scraper.getId());
			
			
			
			jantje.setName(persono.getName());
			jantje.setLastName(persono.getLastName());
			jantje.setAddresses(persono.getAddresses());
			jantje.setAge(persono.getAge());
			personDTO.add(jantje);
		}
		
		return personDTO;
		
		//return this.iPersonService.findAll();
	}
	
}
