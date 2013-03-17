/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project2.document.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Email extends Document {
    private String sender;
    private String recipient;
    private String title;

    public Email() {
        super();
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    public void setRecipient(String abchotmailcom) {
        this.recipient = abchotmailcom;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setTitle(String starting_New_Job) {
        this.title = starting_New_Job;
    }

    public String getTitle() {
        return title;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Sender: ").append(getSender()).append("\n");
        builder.append("Recipient: ").append(getRecipient()).append("\n");
        builder.append("Title: ").append(getTitle()).append("\n");
        builder.append("Body: ").append(super.toString());
        return builder.toString();
    }
    
}
