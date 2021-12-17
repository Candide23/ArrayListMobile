package ArrayList;

import java.util.Scanner;

public class MasterClass {
	
	

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	MobilePhone mobilePhone = new MobilePhone("312-555-2345");
	
	
	
	boolean quite = false;
	startPhone();
	printActions();
	
	while(!quite) {
		
		System.out.println("\n Enter action: (6 to show available actions)");
		int action = input.nextInt();
		input.nextLine();
		
		switch (action) {
		case 0:
			System.out.println("\n Shuting down .. ");
			quite = true;
			break;
			
		case 1:
			mobilePhone.printContacts();
			break;
			
		case 2:
			addNewContact();
			break;
			
		case 3: 
			updateContact();
			break;
		case 4:
			removeContact();
			break;
		case 5:
			queryContact();
			break;
		case 6:
			printActions();
			break;

		

		 
		}
		
		
	}

	
	}
	
	
	public static void addNewContact() {
		MobilePhone mobilePhone = new MobilePhone("312-555-2345");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter new Contact Name: ");
		String name = input.nextLine();
		System.out.println("Enter your number: ");
		String phoneNumber = input.nextLine();
		Contacts newContact = Contacts.createContacts(name, phoneNumber);
		if(mobilePhone.addNewContact(newContact)) {
			System.out.println("New Contact Added: name = "+ name + " , phoneNumber : " + phoneNumber );
		}else {
			System.out.println("Can't add, " + name +" already on file");
		}
	}
	
	
	public static void updateContact() {
		MobilePhone mobilePhone = new MobilePhone("312-555-2345");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter existing contact name : ");
		String name = input.nextLine();
		Contacts extContact = mobilePhone.queryContact(name);
		if(extContact == null) 
		{
			System.out.println("Cannot found contact");
			return;
		}
		
		System.out.println("Enter new Conatct Name: ");
		String newName = input.nextLine();
		System.out.println("Enter new Phone Number: ");
		String newNumber = input.nextLine();
		
		Contacts newContact = Contacts.createContacts(newName, newNumber);
		if(mobilePhone.updateContact(extContact, newContact)) 
		{
			System.out.println("Successfully updated");
		}else {
			System.out.println("Error Updating Contact");
		}
	}
	
	
	public static void removeContact() {
		MobilePhone mobilePhone = new MobilePhone("312-555-2345");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter existing contact name : ");
		String name = input.nextLine();
		Contacts extContact = mobilePhone.queryContact(name);
		if(extContact == null) 
		{
			System.out.println("Cannot found contact");
			return;
		}
		
		if(mobilePhone.removeContact(extContact)) {
			System.out.println("Successfully deleted");
		}else {
			System.out.println("error deleting contact");
		}
	
	}
	
	public static void queryContact() {
		MobilePhone mobilePhone = new MobilePhone("312-555-2345");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter existing contact name : ");
		String name = input.nextLine();
		Contacts extContact = mobilePhone.queryContact(name);
		if(extContact == null) 
		{
			System.out.println("Cannot found contact");
			return;
		}
		
		else {
			System.out.println("Name : " + extContact.getName() + 
			           " Phone Number is: " + extContact.getPhoneNumber());
		}
	
	}
	
	
    public static void startPhone() {
    	System.out.println("starting phone..");
    }
    
    public static void printActions() {
    	
    	System.out.println("\nAvailable actions:\npress");
		System.out.println("0 - to shutDown\n" + 
						"1 - to print contacts\n"+
						"2 - to add a new contact\n"+
						"3 - to update an existing contact\n"+
						"4 - to remove and existing contact\n"+
						"5 - query for existing contact\n"+
						"6 - to print a list of available actions.");
				System.out.println("Choose Your Action: ");
    	
    }
	
	
	
	
	

}
