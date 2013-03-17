/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project2.document.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class File extends Document {
    private String pathname;
    
    public File() {        
    }

    public void setPathname(String pathname) {
        this.pathname = pathname;
    }

    public String getPathname() {
        return pathname;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Path: ").append(getPathname()).append("\n");
        builder.append("Contents: ").append(super.toString());
        return builder.toString();
    }
}
