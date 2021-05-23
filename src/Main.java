import java.time.LocalDate;

import abstracts.BaseCampaignManager;
import abstracts.BaseCustomerManager;
import abstracts.BaseSellerManager;
import entities.concretes.Customer;
import entities.concretes.Gamer;
import entities.concretes.Product;
import entities.concretes.Seller;
import concretes.*;
import adapter.*;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager=new GamerCustomerManager(new EdevletServiceAdapter());
        BaseCampaignManager baseCampaignManager=new CampainingManager(new SalesServiceAdapter());
        BaseSellerManager baseSellerManager=new SellerCustomerManager(new SalesServiceAdapter());
        //Customer customer = new Customer(10,"ab@gmail.com","Ayse","Bal",LocalDate.of(2000,5,8),"12365412365","queen");
        //Customer customer = new Customer(10,"ab@gmail.com","Ayse","Bal",LocalDate.of(2000,5,8),"12365412365");
        Gamer gamer = new Gamer(10,"ab@gmail.com","Ayse","Bal",LocalDate.of(2000,5,8),"12365412365","gtg54");
        Seller seller=new Seller(15,"ek@gmail.com","Esra","Kutlu",LocalDate.of(2000,10,30),"12365236545","5");
        Product game1=new Product(10,2230,"Pubg",30);
        Product game2=new Product(12,1230,"CS",10);
        baseCustomerManager.add(gamer);
        baseCustomerManager.delete(gamer);
        baseCustomerManager.update(gamer);
        baseSellerManager.sell(game1,gamer);
        baseSellerManager.sell(game2,gamer);
        baseCampaignManager.campaignAdd(game1,seller);
        baseCampaignManager.campaignUpdate(game1,seller);
        baseCampaignManager.campaignDelete(game1,seller);

		
		
		
		

	}

}
