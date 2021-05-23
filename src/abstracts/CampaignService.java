package abstracts;

import entities.concretes.Customer;
import entities.concretes.Product;

public interface CampaignService {
	
		void campaignAdd(Product product, Customer customer);
	    void campaignUpdate(Product product, Customer customer);
	    void campaignDelete(Product product, Customer customer);
}
