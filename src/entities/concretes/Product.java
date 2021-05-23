package entities.concretes;

public class Product {
	
	private int id;
	private int price;
    private String Name;
    private int discount;
	
    public Product(int id, int price, String name, int discount) {
		super();
		this.id = id;
		this.price = price;
		Name = name;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
    
    
    

}
