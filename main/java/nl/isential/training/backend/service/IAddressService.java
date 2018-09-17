package nl.isential.training.backend.service;

import java.util.List;

import nl.isential.training.backend.model.Address;

public interface IAddressService {

	public List<Address> findAll();

	public Address create(Address address);

}
