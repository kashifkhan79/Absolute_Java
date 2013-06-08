/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter14.project2.entites;

import com.absolutejava.chapter14.project2.entities.Contact;
import com.absolutejava.chapter14.project2.entities.ContactContainer;
import java.util.Collections;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class ContactContainerTest 
{    
    @Test
    public void canCreateContactContainerObject()
    {
        ContactContainer container = new ContactContainer();
        assertNotNull(container);
    }
    
    @Rule
    public ExpectedException thrown = ExpectedException.none();    
    @Test
    public void canAddContactsToContactContainer()
    {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("Contact should not be null");
        ContactContainer container = new ContactContainer();
        container.addContact(null);        
        container.addContact(new Contact("Kashif", "Khan", "1234567", "xyz@gmail.com"));
        container.addContact(new Contact("Saqib", "Khan", "123456789", "abc@gmail.com"));
        int numberOfContacts = container.getNumberOfContacts();
        assertEquals("Number of contacts are", 2, numberOfContacts);
    }
    
    @Test
    public void canSearchForAContact()
    {
        ContactContainer container = new ContactContainer();        
        container.addContact(new Contact("Kashif", "Khan", "1234567", "xyz@gmail.com"));
        container.addContact(new Contact("Saqib", "Khan", "123456789", "abc@gmail.com"));
        Contact kashif = container.search("Kashif");
        assertNotNull(kashif);
        
        kashif = container.search("elmer");
        assertNull(kashif);        
    }
    
    @Test
    public void canDeleteAContact()
    {
        ContactContainer container = new ContactContainer();
        Contact contact1 = new Contact("Kashif", "Khan", "1234567", "xyz@gmail.com");
        Contact contact2 = new Contact("Saqib", "Khan", "123456789", "abc@gmail.com");
        container.addContact(contact1);
        container.addContact(contact2);
        assertTrue(container.deleteContact(contact1));
        assertTrue(container.getNumberOfContacts() == 1);
        assertFalse(container.deleteContact(contact1));
        assertTrue(container.deleteContact(contact2));
        assertTrue(container.getNumberOfContacts() == 0);
    }
    
    @Test
    public void canSortContacts()
    {        
        Contact contact1 = new Contact("Kashif", "Khan", "1234567", "xyz@gmail.com");
        Contact contact2 = new Contact("Saqib", "Khan", "123456789", "abc@gmail.com");
        Contact contact3 = new Contact("Sheraz", "Ahmed", "123456789", "abc@gmail.com");
        Contact contact4 = new Contact("Iftikhar", "Khan", "1234567", "xyz@gmail.com");
        Contact contact5 = new Contact("Iffat", "Maab", "123456789", "abc@gmail.com");
        Contact contact6 = new Contact("Salman", "Khan", "123456789", "abc@gmail.com");
        Contact contact7 = new Contact("Kashif", "Khan", "1234567", "abc@gmail.com");
        
        ContactContainer container = new ContactContainer();
        container.addContact(contact1);
        container.addContact(contact2);
        container.addContact(contact3);
        container.addContact(contact4);
        container.addContact(contact5);
        container.addContact(contact6);
        container.addContact(contact7);       
        
        List<Contact> contacts = container.getAllContacts();
        Collections.sort(contacts);
        
        assertEquals("First contact is ", contacts.get(0), contact5);
        assertEquals("Second contact is ", contacts.get(1), contact4);
        assertEquals("Third contact is ", contacts.get(2), contact7);
        assertEquals("Fourth contact is ", contacts.get(3), contact1);
        assertEquals("Fifth contact is ", contacts.get(4), contact6);
        assertEquals("Sixth contact is ", contacts.get(5), contact2);
        assertEquals("Seventh contact is ", contacts.get(6), contact3);
    }
}