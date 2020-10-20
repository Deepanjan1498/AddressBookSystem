package capgemini.addressbooksystem;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class AddressBookIOService 
{
	private static  String ADDRESS_BOOK_FILE="Contact.txt";
	public void writeContact(List<Contacts> contacts)
	{
		StringBuffer contactBuffer=new StringBuffer();
		contacts.forEach(contact->contactBuffer.append(contact.toString().getBytes()));
		try
		{
			Files.write(Paths.get(ADDRESS_BOOK_FILE),contactBuffer.toString().getBytes());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public List<Contacts> readContactFile() {
		List<Contacts> contactList = new ArrayList<>();
		try {
				Files.lines(Paths.get("Contact.txt"))
						.forEach(lines -> {
							String[] contactsArray=lines.split(",");
								String firstName = contactsArray[0];
								String lastName = contactsArray[1];
								long phone = Long.parseLong(contactsArray[2]);
								String email = contactsArray[3];
								String address = contactsArray[4];
								int zip = Integer.parseInt(contactsArray[5]);
								String city = contactsArray[6];
								String state = contactsArray[7];	
								
								
								Contacts contactsObj = new Contacts(firstName, lastName, phone,email,address,zip,city,state);
								contactList.add(contactsObj);
						});
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return contactList;
	}
}