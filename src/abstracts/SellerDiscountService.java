package abstracts;

import entities.concretes.Product;

public interface SellerDiscountService {
	
	double discountedPrice(Product product);

}
