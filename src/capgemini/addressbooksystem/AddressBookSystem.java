package capgemini.addressbooksystem;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class AddressBookSystem {
	
	private static Map<String,AddressBookMain> addressMap=new TreeMap<>();
	public static void addNewAddressBook()
	{
		Scanner sc=new Scanner(System.in);
		AddressBookMain object=new AddressBookMain();
		System.out.println("Enter the name of the address book");
		String name=sc.next();
		addressMap.put(name,object);
		object.multipleAddressBook();
	}
	
	public static void main(String args[])
	{
		AddressBookSystem AddressBook=new AddressBookSystem();
		System.out.println("Enter 1 to add a book");
		AddressBookSystem.addNewAddressBook();
	}
}


