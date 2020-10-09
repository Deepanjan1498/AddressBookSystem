package capgemini.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {

	int numOfContact = 0;
	private Contacts[] contactArray;

	public AddressBookMain() {
		contactArray = new Contacts[8];
	}

	/**
	 *uc2
	 */
	public void addNewContact(String firstName, String lastName, long phoneNumber, String emailId, String address,
			int zipcode, String city, String state) {
		contactArray[numOfContact] = new Contacts(firstName, lastName, phoneNumber, emailId, address, zipcode, city,
				state);
		System.out.println(contactArray[numOfContact]);
		numOfContact++;
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Name of the contact");
		String firstName = s.nextLine();
		System.out.println("Enter Last Name of the contact");
		String lastName = s.nextLine();
		System.out.println("Enter Phone Number of the contact");
		long phoneNumber = s.nextLong();
		System.out.println("Enter EmailId of the contact");
		String emailId = s.next();
		System.out.println("Enter Address of the contact");
		String address = s.next();
		System.out.println("Enter ZipCode of the contact");
		int zipcode = s.nextInt();
		System.out.println("Enter City of the contact");
		String city = s.next();
		System.out.println("Enter State of the contact");
		String state = s.next();
		AddressBookMain Contactno1 = new AddressBookMain();
		Contactno1.addNewContact(firstName, lastName, phoneNumber, emailId, address, zipcode, city, state);
        s.close();
	}

}
