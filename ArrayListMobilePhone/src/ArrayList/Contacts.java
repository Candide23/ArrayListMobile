package ArrayList;

import java.util.ArrayList;

public class Contacts {
	
	private String name;
	private String phoneNumber;
	
	
	


	public Contacts(String name, String phoneNumber) {
		
		this.name = name;
		this.phoneNumber = phoneNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public static Contacts createContacts(String name, String phoneNumber) {
		return  new Contacts(name, phoneNumber);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
