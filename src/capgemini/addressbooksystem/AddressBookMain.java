package capgemini.addressbooksystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

	private ArrayList<Contacts> contactArray;
	private Map<String, Contacts> contactMap;

	public AddressBookMain() {
		contactArray = new ArrayList<>();
		contactMap = new HashMap<>();
	}

	/**
	 * uc2
	 */
	public void addNewContact() {
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
		Contacts con = new Contacts(firstName, lastName, phoneNumber, emailId, address, zipcode, city, state);
		contactArray.add(con);
		contactMap.put(firstName, con);
	}

	/**
	 * uc3
	 */
	public void editContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Name Whose contact details is to be Edited: ");
		String fn = sc.nextLine();
		Contacts obj = contactMap.get(fn);
		System.out.println();
		System.out.println("Enter the PhoneNumber");
		int num = sc.nextInt();
		obj.setPhoneNumber(num);
		System.out.println("Enter the Email");
		String emId = sc.next();
		obj.setEmailId(emId);
		System.out.println("Enter the Address");
		String add = sc.next();
		obj.setAddress(add);
		System.out.println("Enter the Zipcode");
		int zip = sc.nextInt();
		obj.setZipCode(zip);
		System.out.println("Enter the City");
		String cit = sc.next();
		obj.setCity(cit);
		System.out.println("Enter the State");
		String sta = sc.next();
		obj.setState(sta);
	}

	public void printContact() {
		System.out.println(contactArray);
	}

	/**
	 * uc4
	 */
	public void deleteContact() {
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter The First Name to delete the contact details");
		String first = sd.nextLine();
		Contacts obj = contactMap.get(first);
		contactArray.remove(obj);
	}

	/**
	 * uc5
	 *args
	 */
	public void  multipleAddressBook() {
		Scanner sa = new Scanner(System.in);
		AddressBookMain Contactno1=new AddressBookMain();
		for(int i=1;i>0;i++)
		{
		System.out.println("Enter the choice to be performed \n1.Add new Contact Details. \n2.Edit Existing Contact Details. \n3. Delete Contact Details \n4.Print Address Book \n5.Close");
		int choice=sa.nextInt();
		switch(choice){
		case 1:Contactno1.addNewContact();
		       break;
		case 2:Contactno1.editContact();
               break;		
		case 3:Contactno1.deleteContact();
               break;
		case 4:Contactno1.printContact();       
               break;
		case 5:System.exit(0);;       
		  }
	    }	
	}

	
}