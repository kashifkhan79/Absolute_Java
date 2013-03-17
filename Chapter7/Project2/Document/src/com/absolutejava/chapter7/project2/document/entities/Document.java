/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project2.document.entities;

import java.util.Objects;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Document {
    
    private String text;
    
    public Document() {
        
    }
    
    public Document(String text) {
        this.text = text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    
    public static boolean ContainsKeyword(Document docObject, String keyword) {
        if(docObject.toString().indexOf(keyword, 0) >= 0 ) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return text;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.text);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Document other = (Document) obj;
        if (!Objects.equals(this.text, other.text)) {
            return false;
        }
        return true;
    }  
    
}
