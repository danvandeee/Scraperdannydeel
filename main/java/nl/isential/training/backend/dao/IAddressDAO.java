package nl.isential.training.backend.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import nl.isential.training.backend.model.Address;

public interface IAddressDAO extends CrudRepository<Address, Long> {

	List<Address> findAll();

}
