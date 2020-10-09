package capgemini.addressbooksystem;

public class Contacts {
	private String firstname;
	private String lastname;
	private long phoneNumber;
	private String emailId;
	private String address;
	private int zipcode;
	private String city;
	private String state;

	public Contacts(String firstname, String lastname, long phoneNumber, String emailId, String address, int zipcode,
			String city, String state) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.address = address;
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "AddressBook [firstname=" + firstname + ", lastname=" + lastname + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + ", address=" + address + ", zipcode=" + zipcode + ", city=" + city
				+ ", state=" + state + "]";
	}

}
