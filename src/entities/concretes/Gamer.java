package entities.concretes;

import java.time.LocalDate;

public class Gamer extends Customer{
	
	private String nickName;

	public Gamer(int id, String email, String firstName, String lastName, LocalDate dateOfBirth,
			String nationalityId,String nickName) {
		super(id, email, firstName, lastName, dateOfBirth, nationalityId);
		this.nickName = nickName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	

}
