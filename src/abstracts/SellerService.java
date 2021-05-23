package abstracts;

import entities.concretes.Customer;
import entities.concretes.Product;

public interface SellerService {
	
	void sell (Product product, Customer customer);

}
