package capgemini.addressbooksystem;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class AddressBookSystem {
	
	private static Map<String,AddressBookMain> addressMap=new TreeMap<>();
	/**
	 * uc6
	 */
	public void addNewAddressBook()
	{
		Scanner sc=new Scanner(System.in);
		AddressBookMain object=new AddressBookMain();
		System.out.println("Enter the name of the address book");
		String name=sc.next();
		addressMap.put(name,object);
		object.multipleAddressBook();
	}
	
	/**
	 * uc8
	 * @param search
	 */
	public static void personSearch(String search) {
		int numOfPerson=0;
		Iterator contactArray = addressMap.entrySet().iterator();
		while(contactArray.hasNext()) {
			Map.Entry entry=(Map.Entry) contactArray.next();
			AddressBookMain a=(AddressBookMain)entry.getValue();
			List<Contacts> list=a.getcontactArray();
			for(Contacts con:list)
			{
				if(con.getCity().equals(search)||con.getState().equals(search))
				{
					System.out.println(con);
					numOfPerson++;
				}
			}
			if(numOfPerson==0)
				System.out.println("No person was found");
		}
		
	}
	public static void main(String args[])
	{
		AddressBookSystem AddressBook=new AddressBookSystem();
		for(int i=0;i>=0;i++)
		{   Scanner sn=new Scanner(System.in);
			System.out.println("\n1.Adding a Address Book");
			System.out.println("\n2.Searching for a Person in Address Books");
			System.out.println("\n3. Exit");
			System.out.println("\n Enter Your Choice:");
			int num=sn.nextInt();
			switch(num)
			{
			case 1:
			while (true) {
				AddressBookMain main = new AddressBookMain();
				System.out.println("Enter name for address Book");
				String name = sn.next();
				if (AddressBook.addressMap.containsKey(name)) {
					System.out.println("\nDuplicate Address Book Entry not allowed \n");
					continue;
				} else {
					AddressBook.addressMap.put(name, main);
					System.out.println("\n  Address Book : " + name);
					main.multipleAddressBook();
					break;
				}
			}
			break;
			case 2:
				System.out.println("Enter city or state to search for a person");
				String searchIn = sn.next();
				AddressBook.personSearch(searchIn);
				break;

			case 3:
				break;
			}
		}
		
	}
}


