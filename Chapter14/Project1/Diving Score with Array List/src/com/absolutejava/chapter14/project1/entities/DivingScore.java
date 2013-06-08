/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter14.project1.entities;

import com.absolutejava.chapter14.project1.exceptions.InvalidRangeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Kashif Ahmed Khan
 */
class DivingScore 
{
    private static final double DEGREE_OF_DIFFICULTY_MIN_VALUE = 1.2;
    private static final double DEGREE_OF_DIFFICULTY_MAX_VALUE = 3.8;
    private static final double FINAL_SCORE_CONSTANT = 0.6;
    private double degreeOfDifficulty;
    private List<Double> scores;
    
    public DivingScore()
    {
        scores = new ArrayList<>();
    }

    public void setDegreeOfDifficulty(double degreeOfDifficulty) throws InvalidRangeException
    {
        if(validateDegreeOfDifficulty(degreeOfDifficulty))
        {
            throw new InvalidRangeException(getExceptionMessage());
        }
        this.degreeOfDifficulty = degreeOfDifficulty;
    }

    public double getDegreeOfDifficulty() 
    {
        return degreeOfDifficulty;
    }
    
    public void setAllJudgesScore(List<Double> scores)
    {
        this.scores = scores;
    }
    
    public List<Double> getAllJudgesScore()
    {
        return scores;
    }

    public void removeLowestAndHighestScores() 
    {
        Collections.sort(scores);
        double lowestScore = scores.get(0);
        double highestScore = scores.get(6);
        List<Double> temp = scores;
        temp.remove(lowestScore);
        temp.remove(highestScore);
    }
    
    public double getSumOfAllJudgesScore() 
    {
        double sum = 0.0;
        for(Double score : scores)
        {
            sum += score;
        }
        return sum;
    }
    
    public double getFinalScore() 
    {
        return getSumOfAllJudgesScore() * getDegreeOfDifficulty() * FINAL_SCORE_CONSTANT;
    }
    
    private boolean validateDegreeOfDifficulty(double degreeOfDifficulty) 
    {
        return degreeOfDifficulty < DEGREE_OF_DIFFICULTY_MIN_VALUE || degreeOfDifficulty > DEGREE_OF_DIFFICULTY_MAX_VALUE;
    }

    private String getExceptionMessage() 
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Invalid degree of difficulty.").append("\n");
        builder.append("Must be between ").append(DEGREE_OF_DIFFICULTY_MIN_VALUE).append(" and ").append(DEGREE_OF_DIFFICULTY_MAX_VALUE);        
        return builder.toString();
    }    
}
