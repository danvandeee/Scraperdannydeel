package nl.isential.training.backend;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import nl.isential.training.backend.dao.IPersonDAO;
import nl.isential.training.backend.model.Person;

@DataJpaTest
@RunWith(SpringRunner.class)
public class IPersonDAOTest {

	@Autowired
	private IPersonDAO iPersonDAO;
	
	@Test
	public void test_findById() {
		Optional<Person> optional = this.iPersonDAO.findById(1L);
		
		Assert.assertTrue(optional.isPresent());
	}
	
}
