package abstracts;

import entities.concretes.Customer;
import entities.concretes.Product;

public abstract class BaseCampaignManager implements CampaignService{

	@Override
	public void campaignAdd(Product product, Customer customer) {
		  System.out.println(product.getName()+" ürünü " +customer.getFirstName()+" tarafýndan % "+product.getDiscount()+" indirime girdi ");
		
	}

	@Override
	public void campaignUpdate(Product product, Customer customer) {
		System.out.println(product.getName()+" oyununun yeni fiyatý "+product.getPrice());
		
	}

	@Override
	public void campaignDelete(Product product, Customer customer) {
		System.out.println(product.getName()+" oyununun indirimine "+customer.getFirstName()+ " kiþisi tarafýndan son verildi ");
		
	}
	
	

}
