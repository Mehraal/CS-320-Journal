package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
		assertTrue(contact.getContactId().equals("12345"));
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Doe"));
		assertTrue(contact.getPhone().equals("1234567890"));
		assertTrue(contact.getAddress().equals("123 Main St"));

	}


	   public void testContactLengthEquals10() {
	     Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
	     assertEquals("12345", contact.getContactId());

	   }

	   public void testFirstNameLengthEquals10() {
	     Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
	     assertEquals("John", contact.getFirstName());
	   }

	   public void testLastNameLengthEquals10() {
	     Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
	     assertEquals("Doe", contact.getLastName());
	   }

	   public void testPhoneLengthEquals10() {
	     Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
	     assertEquals("1234567890", contact.getPhone());

	   }

	   public void testAddressLengthEquals30() {
	     Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
	     assertEquals("123 Main St", contact.getAddress());

	   }


	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Johnnstonnjon", "Doe", "1234567890", "123454 Main St");

		});
	}
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "John", "Doedoedoedoe", "1234567890", "123454 Main St");

		});
	}
	
	@Test
	void testContactPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "John", "Doe", "1234567890123", "123454 Main St");

		});
	}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "John", "Doe", "1234567890", "123454 Main St, Somewhere, United States of America");

		});
	}

}
