package nl.isential.training.dto;

import javax.persistence.Column;

public class ScraperDTO {

	private Long id;
	
	private String nameofgame;
	
	private double averageReviewScore;
	
	private double highestReviewScore;
	
	private double lowestReviewScore;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameofgame() {
		return nameofgame;
	}

	public void setNameofgame(String nameofgame) {
		this.nameofgame = nameofgame;
	}

	public double getAverageReviewScore() {
		return averageReviewScore;
	}

	public void setAverageReviewScore(double averageReviewScore) {
		this.averageReviewScore = averageReviewScore;
	}

	public double getHighestReviewScore() {
		return highestReviewScore;
	}

	public void setHighestReviewScore(double highestReviewScore) {
		this.highestReviewScore = highestReviewScore;
	}

	public double getLowestReviewScore() {
		return lowestReviewScore;
	}

	public void setLowestReviewScore(double lowestReviewScore) {
		this.lowestReviewScore = lowestReviewScore;
	}
	
	
	
	
}
