package capgemini.addressbooksystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
	

	Scanner sc=new Scanner(System.in);
	private ArrayList<Contacts> contactArray;
	private Map<String,Contacts> contactMap;
	public AddressBookMain()
	{
		contactArray=new ArrayList<>();
		contactMap=new HashMap<>();
	}
	/**
	 *uc2
	 */
	public void addNewContact(String firstName, String lastName, long phoneNumber, String emailId, String address,
			int zipcode, String city, String state) {
		Contacts con = new Contacts(firstName, lastName, phoneNumber, emailId, address, zipcode, city,
				state);
		contactArray.add(con);
		contactMap.put(firstName,con);
	}
	/**
	 * uc3
	 */
	public void editContact()
	{
		System.out.println("Enter The First Name Whose contact details is to be Edited: ");
		String fn=sc.nextLine();
		Contacts obj=contactMap.get(fn);
		System.out.println();
		System.out.println("Enter the PhoneNumber");
		int num=sc.nextInt();
		obj.setPhoneNumber(num);
		System.out.println("Enter the Email");
		String emId=sc.next();
		obj.setEmailId(emId);
		System.out.println("Enter the Address");
		String add=sc.next();
		obj.setAddress(add);
		System.out.println("Enter the Zipcode");
		int zip=sc.nextInt();
		obj.setZipCode(zip);
		System.out.println("Enter the City");
		String cit=sc.next();
		obj.setCity(cit);
		System.out.println("Enter the State");
		String sta=sc.next();
		obj.setState(sta);
	}
	public void printContact()
	{
	System.out.println(contactArray);
	}
	/**
	 * uc4
	 */
	public void deleteContact()
	{
		System.out.println("Enter The First Name to delete the contact details");
		String fn=sc.nextLine();
		Contacts obj=contactMap.get(fn);
		contactArray.remove(obj);
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
        Contactno1.printContact();
        Contactno1.editContact();
        System.out.println("After Editing the conntacts :");
        Contactno1.printContact();
        Contactno1.deleteContact();
        System.out.println("After Deleting the contact:");
        Contactno1.printContact();
	}

}