package nl.isential.training.backend.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import nl.isential.training.backend.model.Person;
import nl.isential.training.backend.model.Scrapingmodel;
import java.lang.String;

public interface IScrapingmodelDAO extends CrudRepository <Scrapingmodel, Long> {

	@Override
	List<Scrapingmodel> findAll();
	
	@Override
	Optional<Scrapingmodel> findById(Long id);
	
	List<Scrapingmodel> findByNameofgame(String nameofgame);
	
	List<Scrapingmodel> findByAverageReviewScore (double averageReviewScore);
	
	List<Scrapingmodel> findByHighestReviewScore(double highestReviewScore);
	
	List<Scrapingmodel> findByLowestReviewScore(double lowestReviewScore);
	
	
}
