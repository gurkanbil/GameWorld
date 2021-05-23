package adapter;

import abstracts.SellerDiscountService;
import entities.concretes.Product;

public class SalesServiceAdapter implements SellerDiscountService{

	@Override
	public double discountedPrice(Product product) {
		
		return product.getPrice() - (product.getPrice() * product.getDiscount()) / 100;
	}
	
	

}
