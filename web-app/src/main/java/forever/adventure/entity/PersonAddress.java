package forever.adventure.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Address")
@Access(AccessType.FIELD)
@Table(name="PersonAddress", catalog="AdventureWorks")
public class PersonAddress {
	@Id
	@Column(name="AddressId")
	private int id;
	
	@Column(name="AddressLine1")
	private String addressLine1;
	
	@Column(name="City")
	private String city;

}
