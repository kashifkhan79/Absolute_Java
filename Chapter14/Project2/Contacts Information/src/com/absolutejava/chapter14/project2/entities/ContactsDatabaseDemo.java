/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter14.project2.entities;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class ContactsDatabaseDemo {
    
    private static Scanner scanner = new Scanner(System.in);
    private static ContactContainer database = new ContactContainer();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int input;
        do
        {
            ContactsDatabaseDemo.createMenuToGetInput();
            input = ContactsDatabaseDemo.getUserInput();
            processInput(input);
        }while (input != 5);
    }
    
    private static void createMenuToGetInput()
    {
        System.out.println("1. Add a Contact");
        System.out.println("2. Display All Contacts");
        System.out.println("3. Search for a specific Contact");
        System.out.println("4. Delete a specific Contact");
        System.out.println("5. Exit");
        System.out.println("");
        System.out.print("Enter you choice: ");       
    }
    
    private static int getUserInput()
    {
        return scanner.nextInt();
    }
    
    private static void processInput(int input)
    {
        switch(input)
        {
            case 1:
                getContactInput();
                break;
            case 2:
                displayAllContacts();
                break;
            case 3:
                searchAContact();
                break;
            case 4:
                deleteAContact();
                break;
            case 5:
                exitProgram();
                break;
        }
    }

    private static void getContactInput() 
    {
        System.out.print("Enter first name of the contact: ");
        String firstName = scanner.next();        
        System.out.print("Enter last name of the contact: ");
        String lastName = scanner.next();
        System.out.print("Enter telephone number of the contact: ");
        String telephoneNumber = scanner.next();
        System.out.print("Enter E-mail address of the contact: ");
        String emailAddress = scanner.next();
        
        final Contact contact = new Contact(firstName, lastName, telephoneNumber, emailAddress);
        try
        {
            boolean success = database.addContact(contact);
            if(success)
            {
                System.out.println("Contact added successfully");
            }
            else
            {
                System.out.println("Contact couldn't be added");
            }
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getStackTrace());
        }
        
        System.out.println("");
    }

    private static void displayAllContacts() 
    {        
        if(database.getNumberOfContacts() > 0)
        {
            List<Contact> contacts = database.getAllContacts();
            for(Contact c : contacts)
            {
                System.out.println(c);
            }
        }
        else
        {
            System.out.println("No contacts are present.");
        }        
        System.out.println("");
    }

    private static Contact searchAContact() 
    {
        System.out.print("Enter the search string ");
        String input = scanner.next();
        Contact contact = database.search(input);
        if(contact != null)
        {
            System.out.println("Following Contact with the search criteria was found");
            System.out.println(contact);
        }
        else
        {
            System.out.println("No Contact with the search criteria was found");
        }
        System.out.println("");
        return contact;
    }

    private static void deleteAContact() 
    {
        Contact contact = searchAContact();
        if(contact != null)
        {
            System.out.print("Do you want to delete this contact (Y/N): ");
            String input = scanner.next();
            if (input.equals("Y") || input.equals("y"))
            {
                boolean deleted = database.deleteContact(contact);
                if(deleted)
                {
                    System.out.println("Contact was successfully deleted");
                }
                else
                {
                    System.out.println("Error deleting contact");
                }
            }
        }
        System.out.println("");
    }

    private static void exitProgram() 
    {
        System.out.println("Exiting Program");
        System.exit(0);
    }    
}
