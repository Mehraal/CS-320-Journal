package main;
import java.util.ArrayList;



public class ContactService {
	public ArrayList<Contact> contacts = new ArrayList<>();



	public void addContact(String contactId, String firstName, String lastName, String phone, String address) {
		// Create the new contact
		Contact contact = new Contact(contactId, firstName, lastName, phone, address);
		contacts.add(contact);

	}

	public Contact getContact(String contactID) {
		Contact contact = new Contact(null, null, null, null, null);
		for (Contact contact2 : contacts) {
			if (contact2.getContactId().contentEquals(contactID)) {
				contact = contact2;
			}
		}
		return contact;
	}



	public void deleteContact(String contactID) {
		for (int counter = 0; counter < contacts.size(); counter++) {
			if (contacts.get(counter).getContactId().equals(contactID)) {
				contacts.remove(counter);
				break;
			}
			if (counter == contacts.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}


	public void updateFirstName(String updatedString, String contactID) {
		for (int counter = 0; counter < contacts.size(); counter++) {
			if (contacts.get(counter).getContactId().equals(contactID)) {
				contacts.get(counter).setFirstName(updatedString);
				break;
			}
			if (counter == contacts.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}

	public void updateLastName(String updatedString, String contactID) {
		for (int counter = 0; counter < contacts.size(); counter++) {
			if (contacts.get(counter).getContactId().equals(contactID)) {
				contacts.get(counter).setLastName(updatedString);
				break;
			}
			if (counter == contacts.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}

	public void updatePhone(String updatedString, String contactID) {
		for (int counter = 0; counter < contacts.size(); counter++) {
			if (contacts.get(counter).getContactId().equals(contactID)) {
				contacts.get(counter).setPhone(updatedString);
				break;
			}
			if (counter == contacts.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}


	public void updateAddress(String updatedString, String contactID) {
		for (int counter = 0; counter < contacts.size(); counter++) {
			if (contacts.get(counter).getContactId().equals(contactID)) {
				contacts.get(counter).setAddress(updatedString);
				break;
			}
			if (counter == contacts.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}
}