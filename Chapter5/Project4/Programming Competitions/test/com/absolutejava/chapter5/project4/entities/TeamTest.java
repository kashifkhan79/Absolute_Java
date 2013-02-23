/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.project4.entities;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class TeamTest {
    
    @Test
    public void canCreateTeam(){
        Team test = new Team();
        assertNotNull(test);
    }
    
    @Test
    public void canCreateTeamWithTeamName() {
        Team aTeam = new Team("Alpha");
        assertNotNull(aTeam);
        String teamName = aTeam.getTeamName();
        assertEquals("Team name is", "Alpha", teamName);
    }
    
    @Test
    public void aTeamHasATeamMemberWithAName(){
        Team aTeam = new Team();
        aTeam.setTeamName("Alpha");
        aTeam.setName1("John");
        String name1 = aTeam.getName1();
        assertEquals("Team member1 name is", "John", name1);
    }
    
    @Test
    public void aTeamHasFourTeamMembers(){
        Team aTeam = new Team("Alpha");
        aTeam.setName1("John");
        aTeam.setName2("Filip");
        aTeam.setName3("Martin");
        aTeam.setName4("Ola");
        String name1 = aTeam.getName1();
        String name2 = aTeam.getName2();
        String name3 = aTeam.getName3();
        String name4 = aTeam.getName4();
        
        assertEquals("Team member1 name is", "John", name1);
        assertEquals("Team member2 name is", "Filip", name2);
        assertEquals("Team member3 name is", "Martin", name3);
        assertEquals("Team member4 name is", "Ola", name4);
    }
    
    @Test    
    public void aTeamParticipatesInTwoCompetitions() {
        Team aTeam = new Team("Alpha", "John", "Filip", "Martin", "Ola");
        Competition competition1 = new Competition("TDD Competition", "Alpha Team", "Beta Team", 2013);
        Competition competition2 = new Competition("TDD Competition", "Gamma Team", "Delta Team", 2013);
        aTeam.setCompetition1(competition1);
        aTeam.setCompetition2(competition2);
        
        Competition test1 = aTeam.getCompetition1();
        assertEquals("Competition1 is same", competition1, test1);
        
        Competition test2 = aTeam.getCompetition2();
        assertEquals("Competition2 is same", competition2, test2);        
    }
    
    @Test    
    public void canCreateTeamEntrySimilarToPreviousYearEntry(){
        Team team1 = new Team("Alpha", "John", "Filip", "Martin", "Ola");
        Competition competition1 = new Competition("TDD Competition", "Alpha Team", "Beta Team", 2012);
        Competition competition2 = new Competition("TDD Competition", "Gamma Team", "Delta Team", 2012);
        team1.setCompetition1(competition1);
        team1.setCompetition2(competition2);
        
        Team team2 = new Team(team1);
        
        assertEquals("Teams with same information", team1.getTeamInformation(), team2.getTeamInformation());
        
        team1.setCompetition2(new Competition("Pair Programming", "Yoda Team", "Zeta Team", 2013));
        
        team2 = new Team(team1);
        
        assertNotSame("Teams with different information", team2.getTeamInformation(), team1.getTeamInformation());       
    }
    
}
