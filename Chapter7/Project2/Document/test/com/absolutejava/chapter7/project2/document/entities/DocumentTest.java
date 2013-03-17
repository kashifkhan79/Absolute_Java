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
public class DocumentTest {
    
    @Test
    public void canCreateDocumentObject() {
        Document document = new Document();
        assertNotNull(document);
    }
    
    @Test
    public void aDocumentHasTextContent() {
        Document document = new Document();
        document.setText("This is the text of the document");
        assertEquals("Text is", "This is the text of the document", document.toString());
    }
    
    @Test
    public void aDocumentCanLookIfAKeywordIsPresent() {
        Document document = new Document();
        document.setText("This is the text of the document");
        assertTrue(Document.ContainsKeyword(document, "of the document"));
        
        Email email = new Email();
        email.setText("I am starting a new job");
        assertFalse(Document.ContainsKeyword(email, "of the document"));
        assertTrue(Document.ContainsKeyword(email, "I am"));
        
        File file = new File();
        file.setText("");
        assertTrue(Document.ContainsKeyword(file, ""));
    }
}