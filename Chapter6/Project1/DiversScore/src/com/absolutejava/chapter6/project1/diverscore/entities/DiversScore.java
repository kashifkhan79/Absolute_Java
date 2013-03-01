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
    private static final int INDEX_MIN = 0;
    private static final int INDEX_MAX = 7;
    private static final int INDIVIDUAL_SCORE_MIN = 1;
    private static final int INDIVIDUAL_SCORE_MAX = 10;    
    private static final float DIVER_SCORE_CONSTANT = 0.6F;
    private static final float DIVE_DIFFICULTY_MIN = 1.2F;
    private static final float DIVE_DIFFICULTY_MAX = 3.8F;
    private float[] scores;
    private float diveDifficulty;
    
    public DiversScore() {
        this.scores = new float[INDEX_MAX];
    }

    public void setScores(float[] scores) {
        if(isScoreLengthInvalid(scores)) {
            throw new ArrayIndexOutOfBoundsException("A Dive can only be scored by 7 judges");
        }
        this.scores = scores;
    }
    
    public float[] getScores() {
        return Arrays.copyOfRange(scores, INDEX_MIN, INDEX_MAX);
    }

    public void setIndividualScore(int index, float individualScore) {
        if(isIndexInvalid(index)) {
            throw new ArrayIndexOutOfBoundsException("Index should be between 0 and 7");
        }
        if(isIndividualScoreInvalid(individualScore)) {
            throw new IllegalArgumentException("Score should be between 0 and 10");
        }        
        this.scores[index] = individualScore;
    }

    public void setDiveDifficulty(float diveDifficulty) {
        if(isDiveDifficultyInvalid(diveDifficulty)) {
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

    private boolean isScoreLengthInvalid(float[] scores) {
        return (scores.length > INDEX_MAX);
    }
    
    private boolean isIndexInvalid(int index) {
        return (index < INDEX_MIN || index > INDEX_MAX);
    }

    private boolean isIndividualScoreInvalid(float individualScore) {
        return (individualScore < INDIVIDUAL_SCORE_MIN || individualScore > INDIVIDUAL_SCORE_MAX);
    }

    private boolean isDiveDifficultyInvalid(float diveDifficulty) {
        return (diveDifficulty < DIVE_DIFFICULTY_MIN || diveDifficulty > DIVE_DIFFICULTY_MAX);
    }
    
}
