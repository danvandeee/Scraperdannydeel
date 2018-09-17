package nl.isential.training.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import nl.isential.training.backend.model.Scrapingmodel;


public interface IDannyScrapeTestApplicationService {
	
	public List<Scrapingmodel> findAll();
	
	
	public void ScrapeService(String searchString);
		
		
	
	
	public String getgoogleSearch (String searchString);
	
	
	
	
	public String getSiteReview(String degameString);
	
	
	
	
	
	
}
