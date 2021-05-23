package adapter;

import abstracts.CustomerCheckService;
import entities.concretes.Customer;

public class EdevletServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return customer.getNationalityId().length()==11;
	}
}
