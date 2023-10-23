package in.pwskills.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pwskills.entity.Customer;
import in.pwskills.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {

	@Autowired
	private ICustomerService service;

	//RESTFUL API for retreival operation
	@GetMapping("/showdata")
	public List<Customer> listOfCustomers(){
		return service.findAllCustomer();
	}
	
	//RESTFUL API for retreival operation of one record
	@GetMapping("/showdata/{cid}")
	public ResponseEntity<Customer> customerById( @PathVariable("cid") Integer id){
		try {
		Customer customer = service.findCustomerByid(id);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}catch(Exception e){
		return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);//this will be shown on the top of the console of postman 
	}
	}
	
	//RESTFULL API for insertion operation
	@PostMapping("/save")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){  //here we are writting @requestbody because we r recieving empl details from posman
		service.saveCustomer(customer);
		return new ResponseEntity<Customer>(HttpStatus.CREATED);//this will be shown on the top of the console of postman 
	}

	//RESTFuL API for update of customer
	@PostMapping("/update/{id}")
	public ResponseEntity<?> updateCustomer(@RequestBody Customer customer, @PathVariable Integer id){  // we r writting ? here cause the object is not fixed 
		try {
		Customer existingCust = service.findCustomerByid(id);
		System.out.println(existingCust);
		service.saveCustomer(customer);
		return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	//RESTFuL API for deletion of customer
	@DeleteMapping("/delete/{id}")
	public void deleteCustomer(@PathVariable Integer id) {
		service.deleteCustomerById(id);
	}

}
