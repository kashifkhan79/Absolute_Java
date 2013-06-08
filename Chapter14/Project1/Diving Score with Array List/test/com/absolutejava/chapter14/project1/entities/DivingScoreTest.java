/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter14.project1.entities;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import com.absolutejava.chapter14.project1.exceptions.InvalidRangeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class DivingScoreTest 
{
    
    @Test
    public void canCreateDivingScoreObject()
    {
        DivingScore score = new DivingScore();
        assertNotNull(score);
    }
    
    @Test
    public void canInputDegreeOfDifficultyForADive() throws InvalidRangeException
    {
        DivingScore score = new DivingScore();
        score.setDegreeOfDifficulty(3.5);
        double difficulty = score.getDegreeOfDifficulty();
        assertEquals("Difficulty is ", 3.5, difficulty, 0.0);
    }
    
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void canValidateDegreeOfDifficultyRange() throws InvalidRangeException
    {
        final String exceptionMsg = "Invalid degree of difficulty." + "\nMust be between 1.2 and 3.8";
        thrown.expect(InvalidRangeException.class);
        thrown.expectMessage(exceptionMsg);
        
        DivingScore score = new DivingScore();
        score.setDegreeOfDifficulty(1.1);
        
        thrown.expect(InvalidRangeException.class);
        thrown.expectMessage(exceptionMsg);
        score.setDegreeOfDifficulty(3.9);
    }
    
    @Test
    public void canStoreAllJudgesScore()
    {
        DivingScore score = new DivingScore();
        Double[] scoresByJudges = new Double[] {6.8, 6.4, 6.8, 6.7, 6.9, 6.5, 6.8};
        score.setAllJudgesScore(Arrays.asList(scoresByJudges));
        
        assertEquals("First judge score is ", 6.8, score.getAllJudgesScore().get(0), 0.0);
        assertEquals("Seventh judge score is ", 6.8, score.getAllJudgesScore().get(6), 0.0);
    }
    
    @Test
    public void canThrowAwaySmallestAndHighestScores()
    {
        DivingScore score = new DivingScore();
        List<Double> scoresByJudges = new ArrayList<>();
        scoresByJudges.add(6.8);        
        scoresByJudges.add(6.4);
        scoresByJudges.add(6.8);
        scoresByJudges.add(6.9);
        scoresByJudges.add(6.7);
        scoresByJudges.add(6.5);
        scoresByJudges.add(6.8);
        score.setAllJudgesScore(scoresByJudges);
        score.removeLowestAndHighestScores();
        
        assertEquals("Lowest score is ", 6.5, score.getAllJudgesScore().get(0), 0.0);
        assertEquals("Highest score is ", 6.8, score.getAllJudgesScore().get(4), 0.0);
    }
    
    @Test
    public void canCalculateSumOfAllJudgesScores()
    {
        DivingScore score = new DivingScore();
        List<Double> scoresByJudges = new ArrayList<>();
        scoresByJudges.add(6.8);        
        scoresByJudges.add(6.4);
        scoresByJudges.add(6.8);
        scoresByJudges.add(6.9);
        scoresByJudges.add(6.7);
        scoresByJudges.add(6.5);
        scoresByJudges.add(6.8);
        score.setAllJudgesScore(scoresByJudges);
        score.removeLowestAndHighestScores();
        
        double sum = score.getSumOfAllJudgesScore();
        assertEquals("Lowest score is ", sum, 33.6, 0.0);        
    }
    
    @Test
    public void canCalculateFinalScoreOfDive() throws InvalidRangeException
    {
        DivingScore score = new DivingScore();
        score.setDegreeOfDifficulty(3.5);
        List<Double> scoresByJudges = new ArrayList<>();
        scoresByJudges.add(6.8);        
        scoresByJudges.add(6.4);
        scoresByJudges.add(6.8);
        scoresByJudges.add(6.9);
        scoresByJudges.add(6.7);
        scoresByJudges.add(6.5);
        scoresByJudges.add(6.8);
        score.setAllJudgesScore(scoresByJudges);
        score.removeLowestAndHighestScores();
        
        double finalScore = score.getFinalScore();
        assertEquals("Lowest score is ", finalScore, 70.56, 0.0);        
    }
}