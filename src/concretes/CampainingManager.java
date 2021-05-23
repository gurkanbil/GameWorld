package concretes;

import abstracts.BaseCampaignManager;
import adapter.SalesServiceAdapter;
import entities.concretes.Customer;
import entities.concretes.Product;

public class CampainingManager extends BaseCampaignManager{
	
	SalesServiceAdapter salesServiceAdapter;

    public CampainingManager(SalesServiceAdapter salesServiceAdapter) {
        this.salesServiceAdapter = salesServiceAdapter;
    }

    @Override
    public void campaignAdd(Product product, Customer customer) {
        super.campaignAdd(product, customer);
    }

    @Override
    public void campaignUpdate(Product product, Customer customer) {
        product.setPrice((int)this.salesServiceAdapter.discountedPrice(product));
        super.campaignUpdate(product, customer);
    }

    @Override
    public void campaignDelete(Product product, Customer customer) {
        super.campaignDelete(product, customer);
    }

}
