/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project6.inheritancedemo.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class PersonTest {
    
    @Test
    public void canCreatePersonObject() {
        Person person = new Person();
        assertNotNull(person);
    }
    
    @Test
    public void canCreatePersonObjectWithNameAttribute() {
        Person person = new Person("Kashif Khan");
        assertNotNull(person);
        person.setName("Kashif Ahmed Khan");
        String name = person.getName();
        assertEquals("Person name is", "Kashif Ahmed Khan", name);
    }
    
    @Test
    public void canCreatePersonObjectFromAnotherPersonObject() {
        Person person = new Person();
        person.setName("Kashif A. Khan");
        Person other = new Person(person);
        assertEquals("Person name is", "Kashif A. Khan", other.getName());
    }
    
    @Test
    public void canGetPersonInformationAndComparePersons() {
        Person person = new Person("Kashif Ahmed Khan");
        Person other = new Person(person);
        assertEquals("Persons are same", person, other);
        assertTrue(person.equals(new Person("Kashif Ahmed Khan")));
        assertTrue(new Person("Kashif Ahmed Khan").equals(person));
        assertFalse(other.equals(new Person()));
        assertEquals("Person info is same", "Kashif Ahmed Khan", person.toString());
    }
}