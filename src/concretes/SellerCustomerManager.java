package concretes;

import abstracts.BaseSellerManager;
import adapter.SalesServiceAdapter;
import entities.concretes.Customer;
import entities.concretes.Product;

public class SellerCustomerManager extends BaseSellerManager{
	
	 SalesServiceAdapter salesServiceAdapter;

	    public SellerCustomerManager(SalesServiceAdapter salesServiceAdapter) {
	        this.salesServiceAdapter = salesServiceAdapter;
	    }

	    @Override
	    public void sell(Product product, Customer customer) {
	        product.setPrice((int)this.salesServiceAdapter.discountedPrice(product));
	        super.sell(product, customer);
	    }

}
