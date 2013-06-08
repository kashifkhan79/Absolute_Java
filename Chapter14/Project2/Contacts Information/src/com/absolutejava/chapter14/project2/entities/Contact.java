/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter14.project2.entities;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import java.util.Objects;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Contact implements Comparable<Contact>
{
    private String firstName;
    private String lastName;
    private String telephoneNumber;
    private String emailAddress;
    
    public Contact()
    {
        this("", "", "", "");
    }
    
    public Contact(String firstName, String lastName, String telephoneNumber, String emailAddress)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setTelephoneNumber(telephoneNumber);
        setEmailAddress(emailAddress);
    }
    
    public Contact(Contact contact)
    {        
        this(contact.firstName, contact.lastName, contact.telephoneNumber, contact.emailAddress);
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public final void setFirstName(String firstName) 
    {
        this.firstName = (firstName != null ? firstName : "");
    }

    public String getLastName() 
    {
        return lastName;
    }

    public final void setLastName(String lastName) 
    {
        this.lastName = (lastName != null ? lastName : "");
    }

    public String getTelephoneNumber() 
    {
        return telephoneNumber;
    }

    public final void setTelephoneNumber(String telephoneNumber) 
    {
        this.telephoneNumber = (telephoneNumber != null ? telephoneNumber : "");
    }

    public String getEmailAddress() 
    {
        return emailAddress;
    }

    public final void setEmailAddress(String emailAddress) 
    {
        this.emailAddress = (emailAddress != null ? emailAddress : "");        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.firstName);
        hash = 67 * hash + Objects.hashCode(this.lastName);
        hash = 67 * hash + Objects.hashCode(this.telephoneNumber);
        hash = 67 * hash + Objects.hashCode(this.emailAddress);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) 
    {
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }        
        if(this == obj)
        {
            return true;
        }
        final Contact other = (Contact) obj;
        if (!Objects.equals(this.firstName, other.firstName)) 
        {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) 
        {
            return false;
        }
        if (!Objects.equals(this.telephoneNumber, other.telephoneNumber))
        {
            return false;
        }
        if (!Objects.equals(this.emailAddress, other.emailAddress)) 
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        StringBuilder builder = new StringBuilder();
        builder.append("First Name: ").append(getFirstName()).append("\n");
        builder.append("Last Name: ").append(getLastName()).append("\n");
        builder.append("Telephone Number: ").append(getTelephoneNumber()).append("\n");
        builder.append("E-mail Address: ").append(getEmailAddress()).append("\n");
        return builder.toString();
    }

    @Override
    public int compareTo(Contact o) 
    {
        return ComparisonChain.start()
                              .compare(this.firstName, o.firstName)
                              .compare(this.lastName, o.lastName)
                              .compare(this.telephoneNumber, o.telephoneNumber)
                              .compare(this.emailAddress, o.emailAddress, Ordering.natural())
                              .result();
    }
}
