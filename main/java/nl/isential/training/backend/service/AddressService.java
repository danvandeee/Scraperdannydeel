package nl.isential.training.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import nl.isential.training.backend.dao.IAddressDAO;
import nl.isential.training.backend.model.Address;

@Service
public class AddressService implements IAddressService {

	@Autowired
	private IAddressDAO iAddressDAO;

	@Override
	public List<Address> findAll() {
		return this.iAddressDAO.findAll();
	}

	@Override
	public Address create(Address address) {
		Assert.notNull(address, "Address mag niet null zijn");

		return this.iAddressDAO.save(address);
	}

}
