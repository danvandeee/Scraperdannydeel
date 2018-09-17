package nl.isential.training.dto;

public class CalculatorDTO {
	
	private double eersteGetal;
	private double tweedeGetal;
	private String calculatie;
	private double uitkomst;
	
	public double getEersteGetal() {
		return eersteGetal;
	}
	public void setEersteGetal(double eersteGetal) {
		this.eersteGetal = eersteGetal;
	}
	public double getTweedeGetal() {
		return tweedeGetal;
	}
	public void setTweedeGetal(double tweedeGetal) {
		this.tweedeGetal = tweedeGetal;
	}
	public String getCalculatie() {
		return calculatie;
	}
	public void setCalculatie(String calculatie) {
		this.calculatie = calculatie;
	}
	public double getUitkomst() {
		return uitkomst;
	}
	public void setUitkomst(double uitkomst) {
		this.uitkomst = uitkomst;
	}

}
