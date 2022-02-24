package addressBook;

import java.util.*;

public class ContactManager {
	  private final static List<Contact> contactList = new ArrayList<>();


	    public static void addNewContact() {
	        Contact contact = new Contact();

	        contact.setFirstName(ScannerUtil.getString("Enter First name: "));
	        contact.setLastName(ScannerUtil.getString("Enter Last name: "));
	        contact.setPhoneNumber(ScannerUtil.getLong("Enter Phone number: "));
	        contact.setEmail(ScannerUtil.getString("Enter Email: "));
	        contact.setAddress(ScannerUtil.getString("Enter Address: "));
	        contact.setCity(ScannerUtil.getString("Enter City: "));
	        contact.setState(ScannerUtil.getString("Enter State: "));
	        contact.setZip(ScannerUtil.getInt("Enter Zip code: "));

	        contactList.add(contact);

	    }
}
