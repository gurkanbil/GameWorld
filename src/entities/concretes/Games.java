package entities.concretes;

public class Games extends Product{
		
	private int gameCategoryId;
	
	public Games(int id, int price, String name, int discount) {
		super(id, price, name, discount);
		this.gameCategoryId = gameCategoryId;
	}

	public int getGameCategoryId() {
		return gameCategoryId;
	}

	public void setGameCategoryId(int gameCategoryId) {
		this.gameCategoryId = gameCategoryId;
	}

	
	
	
}
