/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter6.project1.diverscore.entities;

import java.util.Arrays;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class DiversScore {
    private static final int NUMBER_OF_JUDGES = 7;
    private static final int INDIVIDUAL_SCORE_MIN = 1;
    private static final int INDIVIDUAL_SCORE_MAX = 10;
    private static final int INDEX_MIN = 0;
    private static final float DIVER_SCORE_CONSTANT = 0.6F;
    private static final float DIVE_DIFFICULTY_MIN = 1.2F;
    private static final float DIVE_DIFFICULTY_MAX = 3.8F;
    private float[] scores;
    private float diveDifficulty;
    
    public DiversScore() {
        this.scores = new float[NUMBER_OF_JUDGES];
    }

    void setScores(float[] scores) throws ArrayIndexOutOfBoundsException {
        if(scores.length > NUMBER_OF_JUDGES) {
            throw new ArrayIndexOutOfBoundsException("A Dive can only be scored by 7 judges");
        }
        this.scores = scores;
    }
    
    public float[] getScores() {
        return scores;
    }

    public void setIndividualScore(int index, float individualScore) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if(index < INDEX_MIN || index > NUMBER_OF_JUDGES) {
            throw new ArrayIndexOutOfBoundsException("Index should be between 0 and 7");
        }
        if(individualScore < INDIVIDUAL_SCORE_MIN || individualScore > INDIVIDUAL_SCORE_MAX) {
            throw new IllegalArgumentException("Score should be between 0 and 10");
        }        
        this.scores[index] = individualScore;
    }

    public void setDiveDifficulty(float diveDifficulty) {
        if(diveDifficulty < DIVE_DIFFICULTY_MIN || diveDifficulty > DIVE_DIFFICULTY_MAX) {
            throw new IllegalArgumentException("Difficulty should be between 1.2 and 3.8");
        }
        this.diveDifficulty = diveDifficulty;
    }
    
    private float getDiveDifficulty() {
        return diveDifficulty;
    }

    public float getDiveScore() {        
        return calculateDiversFinalScore();
    }
    
    private float calculateDiversFinalScore() {
        return (calculateSumOfScores() - getLowestScore() - getHighestScore()) * getDiveDifficulty() * DIVER_SCORE_CONSTANT;
    }
    
    private float calculateSumOfScores() {
        float sum = 0.0F;
        Arrays.sort(scores);
        for(float score : scores) {
            sum += score;
        }
        return sum;
    }

    private float getLowestScore() {
        return scores[INDEX_MIN];
    }

    private float getHighestScore() {
        return scores[scores.length-1];
    }     
}
