/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter14.project2.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class ContactContainer 
{
    private List<Contact> contacts;
    
    public ContactContainer()
    {
        contacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact) throws NullPointerException
    {
        boolean success = false;
        if(contact != null)
        {
            contacts.add(contact);
            success = true;
        }
        else
        {
            throw new NullPointerException("Contact should not be null");
        }
        return success;
    }
    
    public boolean deleteContact(Contact contact)
    {
        return contacts.remove(contact);
    }

    public int getNumberOfContacts() 
    {
        return contacts.size();
    }
    
    public List<Contact> getAllContacts()
    {
        return new ArrayList<>(contacts);
    }

    public Contact search(String searchString) 
    {
        Contact contact = null;
        for(Contact c : contacts)
        {
            if( c.getFirstName().contains(searchString) || 
                c.getLastName().contains(searchString) || 
                c.getTelephoneNumber().contains(searchString) || 
                c.getEmailAddress().contains(searchString))
            {
                contact = new Contact(c);
                break;
            }
        }
        return contact;
    }
}
