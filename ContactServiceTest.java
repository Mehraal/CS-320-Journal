package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import main.Contact;
import main.ContactService;


class ContactServiceTest {
	public ArrayList<Contact> contacts = new ArrayList<>();

	@Test
    void addContact() {
        Contact contact = new Contact("12345", "John ", "Doe", "1234567890", "123 Main St");

        contacts.add(contact);
        assertEquals( contacts.get( 0).contactId, "12345");
    }


    @Test
    void DeleteContact() {
      //Initialize the service
    ContactService contactService = new ContactService();
      //Initialize the dummy contact
//    Contact contact = new Contact("12345", "John ", "Doe", "1234567890", "123 Main St");
      //Add the dummy contact to the contact service
      contactService.addContact("12345", "John ", "Doe", "1234567890", "123 Main St");
      //Delete the dummy contact
      contactService.deleteContact("12345");

      //Check that the contact service has deleted the dummy contact
    Contact deletedContact = contactService.getContact("12345");
    assertEquals(null, deletedContact);
    }
}
