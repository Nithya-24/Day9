package addressBook;



public class Main {

	public static void main(String[] args) {
		// System.out.println("Welcome to Address Book Program ");
		
		AddressBook obj = new AddressBook("abc","XYZ","22 E","qwer","626109","987654354","abc@def.com", null);
        System.out.println(obj.firstName);
        System.out.println(obj.lastName);
        System.out.println(obj.address);
        System.out.println(obj.city);
        System.out.println(obj.state);
        System.out.println(obj.zip);
        System.out.println(obj.phoneNumber);
        System.out.println(obj.email);
		
		
			
	}

}
