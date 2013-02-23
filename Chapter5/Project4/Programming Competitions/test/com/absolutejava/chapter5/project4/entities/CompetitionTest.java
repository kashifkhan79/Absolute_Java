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
public class CompetitionTest {
    
    @Test
    public void canCreateCompetitionObject(){
        Competition aCompetition = new Competition();
        assertNotNull(aCompetition);
    }
    
    @Test
    public void canCreateCompetitionObjectWithName(){
        Competition aCompetition = new Competition("Programming");
        assertNotNull(aCompetition);
        
        String competitionName = aCompetition.getCompetitionName();
        assertEquals("Competition old name is", "Programming", competitionName);
        
        aCompetition.setCompetitionName("New Programming with TDD");        
        competitionName = aCompetition.getCompetitionName();
        assertEquals("Competition name is", "New Programming with TDD", competitionName);        
    }
    
    @Test
    public void aCompetitionHasAWinningTeam(){
        Competition aCompetition = new Competition("TDD Competition");
        aCompetition.setWiningTeamName("Alpha Team");
        String winningTeamName = aCompetition.getWiningTeamName();
        assertEquals("Winning team name", "Alpha Team", winningTeamName);
    }
    
    @Test
    public void aCompetitionHasARunnerUpTeam(){
        Competition aCompetition = new Competition("TDD Competition");
        aCompetition.setRunnerUpTeamName("Beta Team");
        String runnerUpTeamName = aCompetition.getRunnerUpTeamName();
        assertEquals("Runner team name", "Beta Team", runnerUpTeamName);
    }
    
    @Test
    public void aCompetitionHasAYearWhenItWasHeld(){
        Competition aCompetition = new Competition("TDD Competition");
        aCompetition.setYear(2013);
        int year = aCompetition.getYear();
        assertEquals("Competition held in year", 2013, year);
    }
    
    @Test
    public void canPrintCompetitionInformation(){
        Competition aCompetition = new Competition("TDD Competition");
        aCompetition.setWiningTeamName("Alpha Team");
        aCompetition.setRunnerUpTeamName("Beta Team");
        aCompetition.setYear(2013);
        
        String competitionInformation = aCompetition.getCompetitionInformation();
        
        StringBuilder builder = new StringBuilder();
        builder.append("Competition Name: ").append("TDD Competition").append("\n");
        builder.append("Wining Team: ").append("Alpha Team").append("\n");
        builder.append("Runner-up Team: ").append("Beta Team").append("\n");
        builder.append("Year: ").append(2013);
        String output = builder.toString();
        
        assertEquals("Competition information is", output, competitionInformation);        
    }
    
    @Test
    public void canCreateACompetitionFromAnotherCompetition(){
        Competition aCompetition = new Competition("TDD Competition", "Alpha Team", "Beta Team", 2012);
        Competition other = new Competition(aCompetition);
        
        assertEquals("Competition info is same", aCompetition.getCompetitionInformation(), other.getCompetitionInformation());
    }
    
}
