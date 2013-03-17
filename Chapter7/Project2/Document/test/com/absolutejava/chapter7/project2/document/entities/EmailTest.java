/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project2.document.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class EmailTest {
    
    @Test
    public void canCreateEmailObject() {
        Email email = new Email();
        assertNotNull(email);
    }
    
    @Test
    public void emailHasASender() {
        Email email = new Email();
        email.setSender("abc@google.com");        
        String sender = email.getSender();        
        assertEquals("Sender is ", "abc@google.com", sender);
    }
    
    @Test
    public void emailHasRecipient() {
        Email email = new Email();
        email.setRecipient("abc@hotmail.com");        
        String recipient = email.getRecipient();
        assertEquals("Sender is ", "abc@hotmail.com", recipient);
    }
    
    @Test
    public void emailHasTitle() {
        Email email = new Email();
        email.setTitle("Starting New Job");
        String title = email.getTitle();
        assertEquals("Title is", "Starting New Job", title);
    }
    
    @Test
    public void emailHasText() {
        Email email = new Email();
        email.setText("I am starting new job");
        assertEquals("Email contents are", "I am starting new job", email.getText());
    }
    
    @Test
    public void emailCanPrintAllInformation() {
        Email email = new Email();
        email.setSender("abc@google.com");
        email.setRecipient("abc@hotmail.com");
        email.setTitle("Starting New Job");
        email.setText("I am starting new job");
        
        StringBuilder builder = new StringBuilder();
        builder.append("Sender: ").append("abc@google.com").append("\n");
        builder.append("Recipient: ").append("abc@hotmail.com").append("\n");
        builder.append("Title: ").append("Starting New Job").append("\n");
        builder.append("Body: ").append("I am starting new job");
        
        assertEquals("Email information is", builder.toString(), email.toString());
        
    }
}