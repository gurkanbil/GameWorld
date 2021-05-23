package abstracts;

import entities.concretes.Customer;
import entities.concretes.Product;

public abstract class BaseSellerManager implements SellerService{

	@Override
	public void sell(Product product, Customer customer) {
		System.out.println(product.getName() + " oyunu  " + customer.getFirstName() + " ki�isine  "+product.getPrice() +" TL ye sat�ld� ");
	}
	

}
