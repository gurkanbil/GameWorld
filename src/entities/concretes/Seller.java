package entities.concretes;

import java.time.LocalDate;

public class Seller extends Customer{
	
	private String taxNumber;

	public Seller(int id, String email, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId, String taxNumber) {
		super(id, email, firstName, lastName, dateOfBirth, nationalityId);
		this.taxNumber = taxNumber;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	
	
	
	

}
