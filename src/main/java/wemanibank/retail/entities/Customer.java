package wemanibank.retail.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="CUSTOMERS")
public class Customer {

	@Id
	private Integer customerId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="FAMILY_NAME")
	private String familyName;
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="SECRET")
	private String secret;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
}
