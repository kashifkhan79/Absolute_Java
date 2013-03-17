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
public class FileTest {
    
    @Test
    public void canCreateFileObject() {
        File file = new File();
        assertNotNull(file);
    }
    
    @Test
    public void aFileHasAPath() {
        File file = new File();
        file.setPathname("C:\\Users");        
        String pathname = file.getPathname();
        assertEquals("File path is", "C:\\Users", pathname);
    }
    
    @Test
    public void aFileHasContents() {
        File file = new File();
        file.setText("These are the contents of the file");
        assertEquals("Contents of file are", "These are the contents of the file", file.getText());
    }
    
    @Test
    public void aFileContainsPathnameAndContents() {
        File file = new File();
        file.setPathname("C:\\Users");
        file.setText("These are the contents of the file");
        
        StringBuilder builder = new StringBuilder();
        builder.append("Path: ").append("C:\\Users").append("\n");
        builder.append("Contents: ").append("These are the contents of the file");
        
        assertEquals("", builder.toString(), file.toString());
    }
}