package in.pwskills.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

}
