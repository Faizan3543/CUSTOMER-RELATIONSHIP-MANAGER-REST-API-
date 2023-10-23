package in.pwskills.service;

import java.util.List;

import in.pwskills.entity.Customer;

public interface ICustomerService {

	public List<Customer> findAllCustomer();
	public Customer findCustomerByid(Integer id);
	public void saveCustomer(Customer cust);
	public void deleteCustomerById(Integer id);
}
