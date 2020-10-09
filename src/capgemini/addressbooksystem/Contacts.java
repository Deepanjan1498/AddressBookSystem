package capgemini.addressbooksystem;

public class Contacts {
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private String emailId;
	private String address;
	private int zipcode;
	private String city;
	private String state;

	public Contacts(String firstname, String lastname, long phoneNumber, String emailId, String address, int zipcode,
			String city, String state) {
		super();
		this.firstName = firstname;
		this.lastName = lastname;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.address = address;
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getZipCode() {
		return zipcode;
	}

	public void setZipCode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "AddressBook [firstname=" + firstName + ", lastname=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + ", address=" + address + ", zipcode=" + zipcode + ", city=" + city
				+ ", state=" + state + "]";
	}

}
