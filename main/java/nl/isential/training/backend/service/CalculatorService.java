package nl.isential.training.backend.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {

	@Override
	public double calculate(double eerste, double tweede, String calcu) {
		System.out.println("eerste: " + eerste+ " tweede: " + tweede+ " calcu: " + calcu);
		double uitkomst = 0;
		
		System.out.println("calcu= " + calcu);
		
		if (calcu.equals("+")) {
		uitkomst = eerste + tweede;
		
		} else if (calcu.equals("-")) {
			uitkomst = eerste - tweede;
		} else if (calcu.equals("*")) {
			uitkomst = eerste * tweede;
		}else if (calcu.equals("/")) {
			uitkomst = eerste / tweede;
		}
		
		
		System.out.println(uitkomst);
		
		
		return uitkomst ;
	}

}
