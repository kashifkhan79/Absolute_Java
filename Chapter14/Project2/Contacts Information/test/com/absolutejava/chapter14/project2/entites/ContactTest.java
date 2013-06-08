/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter14.project2.entites;

import com.absolutejava.chapter14.project2.entities.Contact;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class ContactTest {
    
    @Test
    public void canCreateContactObject()
    {
        Contact contact = new Contact();
        assertNotNull(contact);
    }
    
    @Test
    public void canCreateContactFromAnotherContact()
    {
        Contact contact = new Contact("Kashif", null, "1223232", "abc@xyz.com");
        Contact other = new Contact(contact);
        
        assertNotNull(other);
        assertEquals("Last name is ", "", other.getLastName());
    }
}