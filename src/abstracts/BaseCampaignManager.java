package abstracts;

import entities.concretes.Customer;
import entities.concretes.Product;

public abstract class BaseCampaignManager implements CampaignService{

	@Override
	public void campaignAdd(Product product, Customer customer) {
		  System.out.println(product.getName()+" �r�n� " +customer.getFirstName()+" taraf�ndan % "+product.getDiscount()+" indirime girdi ");
		
	}

	@Override
	public void campaignUpdate(Product product, Customer customer) {
		System.out.println(product.getName()+" oyununun yeni fiyat� "+product.getPrice());
		
	}

	@Override
	public void campaignDelete(Product product, Customer customer) {
		System.out.println(product.getName()+" oyununun indirimine "+customer.getFirstName()+ " ki�isi taraf�ndan son verildi ");
		
	}
	
	

}
