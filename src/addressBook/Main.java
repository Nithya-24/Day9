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
		
		
		@SuppressWarnings("resource")
		public void Menu() {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Add ");
			System.out.println("2. Edit ");
			System.out.println("3. Delete ");
			System.out.println("Enter the Choice ");
			int ch = sc.nextInt();
			
			ContactManager contactManager = new ContactManager();
			
			switch(ch) {
			
			case 1: System.out.println("1. Enter the Details to Add The contact ");
					
					contactManager.addNewContact();
		            System.out.println("Contact added to address book successfully.\n");
		            break;
			case 2: System.out.println("2.Edit the Contact  ");
					// return sc.nextInt();
					break;
			case 3: System.out.println("3.Delete the contact ");
					// return sc.nextInt();
					break;
			default: System.out.println("Invalid");
					 break;
			}
}
		/*
		 public void userSelection() {
			 ContactManager contactManager = new ContactManager();
		        do {
		            int choice = Menu();
		            if (choice == 1) {
		                contactManager.addNewContact();
		                System.out.println("Contact added to address book successfully.\n");
		            } else {
		                break;
		            }
		        }while(true);

		 } */
		 public static void main(String[] args) {
			 
		 
		 Main menu = new Main();
	        menu.Menu();
		 }
		
	    	 
	}


