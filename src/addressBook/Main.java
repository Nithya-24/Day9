package addressBook;

import java.util.*;

public class Main {

		// System.out.println("Welcome to Address Book Program ");
		/* 
		AddressBook obj = new AddressBook("abc","XYZ","22 E","qwer","626109","987654354","abc@def.com", null);
        System.out.println(obj.firstName);
        System.out.println(obj.lastName);
        System.out.println(obj.address);
        System.out.println(obj.city);
        System.out.println(obj.state);
        System.out.println(obj.zip);
        System.out.println(obj.phoneNumber);
        System.out.println(obj.email);
		*/
		
		
		public int menu() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println(" Enter the contact to Add ");
			return sc.nextInt();
	}
		 public void userSelection() {
			 ContactManager contactManager = new ContactManager();
		        do {
		            int choice = menu();
		            if (choice == 1) {
		                contactManager.addNewContact();
		                System.out.println("Contact added to address book successfully.\n");
		            } else {
		                break;
		            }
		        }while(true);

		 }
	}


