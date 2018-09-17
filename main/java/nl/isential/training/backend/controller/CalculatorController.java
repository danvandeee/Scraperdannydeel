package nl.isential.training.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.isential.training.backend.model.Address;
import nl.isential.training.backend.service.IAddressService;
import nl.isential.training.backend.service.ICalculatorService;
import nl.isential.training.dto.AddressDTO;
import nl.isential.training.dto.CalculatorDTO;
import nl.isential.training.dto.CalculatorReturnToSiteDTO;

@RestController
public class CalculatorController {

	@Autowired
	private ICalculatorService icalculatorService;
	
	
	@PostMapping("/api/calculate")
	public CalculatorReturnToSiteDTO calculate (@RequestBody CalculatorDTO calculatorDTO) {
	
		CalculatorReturnToSiteDTO degemaaktecalculatie = new CalculatorReturnToSiteDTO();
		
		degemaaktecalculatie.setUitkomst(icalculatorService.calculate(calculatorDTO.getEersteGetal(), calculatorDTO.getTweedeGetal(), calculatorDTO.getCalculatie()));
		
		
		
		
		return degemaaktecalculatie;
		
	}
	
	
}
