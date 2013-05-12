/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter10.project1.entities;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class PersonRecordTest 
{
    @Test
    public void canCreatePersonRecordObject() 
    {
        PersonRecord record = new PersonRecord();
        assertNotNull(record);
    }

    @Test
    public void canReadFirstRecordFromMaleNamesFile() 
    {
        PersonRecord record = new PersonRecord();
        record.readMaleRecordsFromFile();
        List<Person> personsList = record.getMalePersons();
        Person[] males = personsList.toArray(new Person[personsList.size()]);
        assertEquals("First record is", males[0], new Male("Jacob", 29195));
    }
    
    @Test
    public void canReadFiveHundredthRecordFromMaleNamesFile()
    {
        PersonRecord record = new PersonRecord();
        record.readMaleRecordsFromFile();
        List<Person> maleList = record.getMalePersons();
        Person[] males = maleList.toArray(new Person[maleList.size()]);
        assertEquals("Size of males array is", 1000, males.length);
        assertEquals("500 record is", males[499], new Male("Kendall", 490));
    }
    
    @Test
    public void canReadLastRecordFromMaleNamesFile()
    {
        PersonRecord record = new PersonRecord();
        record.readMaleRecordsFromFile();
        List<Person> maleList = record.getMalePersons();
        Person[] males = maleList.toArray(new Person[maleList.size()]);
        assertEquals("Size of males array is", 1000, males.length);
        assertEquals("Last record is", males[999], new Male("Zayne", 157));
    }
    
    @Test
    public void canReadFirstRecordFromFemaleNamesFile()
    {
        PersonRecord record = new PersonRecord();
        record.readFemaleRecordsFromFile();
        List<Person> femaleList = record.getFemalePersons();
        Person[] females = femaleList.toArray(new Person[femaleList.size()]);
        assertEquals("Size of females array is", 1000, females.length);
    }
    
    @Test
    public void canReadFiveHundredthRecordFromFemaleNamesFile()
    {
        PersonRecord record = new PersonRecord();
        record.readFemaleRecordsFromFile();
        List<Person> femaleList = record.getFemalePersons();
        Person[] females = femaleList.toArray(new Person[femaleList.size()]);
        assertEquals("Size of females array is", 1000, females.length);
        assertEquals("500 record is", females[499], new Female("Lena", 567));
    }
    
    @Test
    public void canReadLastRecordFromFemaleNamesFile()
    {
        PersonRecord record = new PersonRecord();
        record.readFemaleRecordsFromFile();
        List<Person> femaleList = record.getFemalePersons();
        Person[] females = femaleList.toArray(new Person[femaleList.size()]);
        assertEquals("Size of females array is", 1000, females.length);
        assertEquals("Last record is", females[999], new Female("Katy", 230));
    }
    
    @Test
    public void canSearchForANameInMaleNamesFile()
    {
        PersonRecord record = new PersonRecord();
        record.readMaleRecordsFromFile();
        int index = record.personIndexInMaleRecords("Justice");
        assertEquals("Record index is", 401, index+1);
        Person person = record.getMalePersons().get(index);
        assertTrue(person.equals(new Male("Justice", 653)));
    }
    
    @Test
    public void canSearchForANameInFemaleNamesFile()
    {
        PersonRecord record = new PersonRecord();
        record.readFemaleRecordsFromFile();
        int index = record.personIndexInFemaleRecords("Justice");
        assertEquals("Record index is", 456, index+1);
        Person person = record.getFemalePersons().get(index);
        assertTrue(person.equals(new Female("Justice", 655)));
    }
    
    @Test
    public void canSearchForANameInBothNamesFiles()
    {
        PersonRecord record = new PersonRecord();
        record.readFemaleRecordsFromFile();
        int index = record.personIndexInFemaleRecords("Walter");
        assertEquals("Record index is", -1, index);
        
        record.readMaleRecordsFromFile();
        index = record.personIndexInMaleRecords("Walter");
        assertEquals("Record index is", 356, index+1);
        Person person = record.getMalePersons().get(index);
        assertTrue(person.equals(new Male("Walter", 775)));        
    }
}