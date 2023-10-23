package in.pwskills.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pwskills.entity.Customer;
import in.pwskills.repository.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private ICustomerRepository repo;

	@Override
	public List<Customer> findAllCustomer() {
		return repo.findAll();
	}

	@Override
	public Customer findCustomerByid(Integer id) {
		Optional<Customer> optional = repo.findById(id);
		return optional.get();
	}

	@Override
	public void saveCustomer(Customer cust) {
		repo.save(cust);
		
	}

	@Override
	public void deleteCustomerById(Integer id) {
		repo.deleteById(id);
		
	}

}
