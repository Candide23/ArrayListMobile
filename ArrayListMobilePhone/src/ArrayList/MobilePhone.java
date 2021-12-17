 package ArrayList;

import java.util.ArrayList;

public class MobilePhone {
	
	private String phoneNumber;
	private ArrayList<Contacts> myContact;
	
	
	public MobilePhone(String phoneNumber) {
		
		this.phoneNumber = phoneNumber;
		this.myContact =  new ArrayList <Contacts>();
		
	}
	

	public boolean addNewContact(Contacts contacts) {
		if(findContact(contacts.getName())>=0) {
			System.out.println("this contact is already on the file");
			return false;
		}
		else {
			myContact.add(contacts);
			return true;
		}
	}
	
	public boolean updateContact(Contacts newContact, Contacts oldContact) {
		
		int foundPosition = findContact(oldContact);
		
		if(foundPosition<0) {
			System.out.println(oldContact + "is no found");
			return false;
		}
		else {
			this.myContact.set(foundPosition, newContact);
			System.out.println(oldContact.getName()+ "is replace by " + "newContact");
			return true;
		}
		
	}
	
public boolean removeContact(Contacts contacts) {
		
		int foundPosition = findContact(contacts.getName());
		
		if(foundPosition<0) {
			System.out.println(contacts.getName() + "is no found");
			return false;
		}
		else {
			this.myContact.remove(foundPosition);
			System.out.println(contacts.getName() + "is remove");
			return true;
		}
		
	}
	
	
	private int findContact(Contacts contacts) {
		return this.myContact.indexOf(contacts);
	}
	
	private int findContact(String name) {
		for(int i = 0; i<myContact.size();i++) {
			Contacts contacts = this.myContact.get(i);{
				if(contacts.getName().equals(name)){
					return i;
					
				}
			}
			
		}
		return -1;
		
	}
	
	public String queryContact(Contacts contacts) {
		
		if(findContact(contacts)>0) {
			return contacts.getName();
		}
		else {
			return null;
		}
		
	}
	
	public Contacts queryContact(String name) {
		int position = findContact(name);
		if(position >=0) {
			return this.myContact.get(position);
		}
		return null;
	}
	
	public void printContacts() {
		System.out.println("Contact List");
		
		for(int i =0; i<this.myContact.size();i++) {
			System.out.println((i+1) + "." + this.myContact.get(i).getName()  + this.myContact.get(i).getPhoneNumber() );
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
