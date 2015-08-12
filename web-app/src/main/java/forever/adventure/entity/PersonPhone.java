package forever.adventure.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name= "PersonPhone")
@Access(AccessType.FIELD)
@Table(name="Person.PersonPhone", catalog="AdventureWorks")
public class PersonPhone {
	@Id
	@Column(name="BusinessEntityId")
	private int id;
	
	@Column(name="PhoneNumber")
	private String phoneNumber;
	
	@Column(name="PhoneNumberTypeId")
	private int phoneType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(int phoneType) {
		this.phoneType = phoneType;
	}
	
}
