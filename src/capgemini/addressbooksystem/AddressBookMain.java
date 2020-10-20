package capgemini.addressbooksystem;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Mentalist
 *
 */
public class AddressBookMain {

	private ArrayList<Contacts> contactArray;
	private Map<String, Contacts> contactMap;
	private Map<String,Contacts> cityToContactEntryMap;
	private Map<String,Contacts> stateToContactEntryMap;
	AddressBookIOService addressBookIOService = new AddressBookIOService();
	public AddressBookMain() {
		contactArray = new ArrayList<>();
		contactMap = new HashMap<>();
		cityToContactEntryMap=new TreeMap<String,Contacts>();
		stateToContactEntryMap=new TreeMap<String,Contacts>();
	}
  
	public List<Contacts> getcontactArray(){
		return contactArray;
	}
	public Map<String,Contacts> getcontactMap()
	{
		return contactMap;
	}
	/**
	 * uc2
	 */
	public void addNewContact() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Name of the contact");
	     String firstName = s.nextLine();
		for(int i=1;i>0;i++){
		     if(duplicateEntryValidation(firstName))
		    	 continue;
		     else 
		    	 break;
		}	
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
	 * &uc 6
	 *args
	 * @param firstName 
	 */
	public void  multipleAddressBook() {
		Scanner sa = new Scanner(System.in);
		for(int i=1;i>0;i++)
		{
			System.out.println("\n1. Add Contact Details");
			System.out.println("\n2. Edit Contact Details");
			System.out.println("\n3. Delete Contact Details");
			System.out.println("\n4. Sorting Contact Details by Person's name:");
			System.out.println("\n5. Sorting Contact Details City:");
			System.out.println("\n6. Sorting Contact Details by ZipCode:");
			System.out.println("\n7. Sorting Contact Details by State:");
			System.out.println("\n8. Exit");
			System.out.println("\nEnter your choice");
			int index=sa.nextInt();
			switch(index)
			{
			case 1:addNewContact();
			break;
			case 2:if(contactArray.size()==0)
					System.out.println("Please Enter the next contacts");
					else
				    editContact();
			break;
			case 3:if(contactArray.size()==0)
					System.out.println("Plese Enter the next contacts");
					else
						deleteContact();
			break;
			case 4:alphabeticSorting();
			case 5:sortingByCity();
			case 6:sortingByZip();
			case 7:sortingByState();
			case 8:System.out.println("Exit");
				   System.exit(0);
			break;
			}
	     }
	}
	    	
	/**
	 * uc7
	 * @return
	 */
	public boolean duplicateEntryValidation(String name) {
		Predicate<Contacts> compareName = n -> n.equals(name);
		boolean result = contactArray.stream().anyMatch(compareName);
		return result;
	}
	/**
	 * uc11
	 */
	public void alphabeticSorting()
	{
	List<Contacts> sortedList = contactArray.stream()
	.sorted(Comparator.comparing(Contacts::getFirstName))
	.collect(Collectors.toList());
	sortedList.forEach(System.out::println);
	}	
	/**
	 * uc12
	 */
	public void sortingByCity()
	{
		List<Contacts> sortedList = contactArray.stream()
		.sorted(Comparator.comparing(Contacts::getCity))
		.collect(Collectors.toList());
		sortedList.forEach(System.out::println);
	}
	public void sortingByZip()
	{
	List<Contacts> sortedList = contactArray.stream()
	.sorted(Comparator.comparingInt(Contacts::getZipCode))
	                      .collect(Collectors.toList());
	sortedList.forEach(System.out::println);
	}	
	public void sortingByState()
	{
		List<Contacts> sortedList = contactArray.stream()
		.sorted(Comparator.comparing(Contacts::getState))
		.collect(Collectors.toList());
		sortedList.forEach(System.out::println);
     }
}