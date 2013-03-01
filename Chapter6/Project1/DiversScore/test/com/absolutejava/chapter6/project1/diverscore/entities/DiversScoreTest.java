/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter6.project1.diverscore.entities;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class DiversScoreTest {

    @Test
    public void canCreateDiverObject() {
        DiversScore diver = new DiversScore();
        assertNotNull(diver);
    }

    @Test
    public void aDiverGetsScoreFromSevenJudges() {
        DiversScore diver = new DiversScore();
        float[] scores = new float[7];
        diver.setScores(scores);
        assertEquals("Diver is scored by seven judges", 7, diver.getScores().length);
    }

    @Test
    public void canGetScores() {
        DiversScore diver = new DiversScore();
        float[] scores = {2.0F, 4.0F, 8.5F, 6.0F, 4.5F, 2.9F, 6.0F};
        diver.setScores(scores);
        assertEquals("Score has value", diver.getScores()[2], 8.5F, 0.0);
        assertArrayEquals("Arrays are equal", scores, diver.getScores() , 0.0F);
    }
    
    @Rule
    public ExpectedException arrayIndexOutOfBound = ExpectedException.none();
    @Test
    public void aDiveCanOnlyBeScoredBySevenJudges() {
        arrayIndexOutOfBound.expect(ArrayIndexOutOfBoundsException.class);
        arrayIndexOutOfBound.expectMessage("A Dive can only be scored by 7 judges");

        DiversScore diver = new DiversScore();
        float[] scores = {1.1F, 3.4F, 2.0F, 4.5F, 2.4F, 5.6F, 3.8F, 6.0F};
        diver.setScores(scores);
    }
    
    @Rule
    public ExpectedException individualScore = ExpectedException.none();
    public ExpectedException index = ExpectedException.none();
    @Test
    public void aDiverScoreIsAlwaysBetweenZeroAndTen() {
        individualScore.expect(IllegalArgumentException.class);
        individualScore.expectMessage("Score should be between 0 and 10");

        DiversScore diver = new DiversScore();
        diver.setIndividualScore(0, -1.0F);

        index.expect(ArrayIndexOutOfBoundsException.class);
        index.expectMessage("Index should be between 0 and 7");

        diver.setIndividualScore(8, 8.9F);

        diver.setIndividualScore(1, 9.5F);
        assertEquals("Score at index is", diver.getScores()[1], 9.5F, 0.0);
    }
    
    @Rule
    public ExpectedException difficulty = ExpectedException.none();
    @Test
    public void aDivesDifficultyIsAlwaysBetweenSpecificValues() {
        difficulty.expect(IllegalArgumentException.class);
        difficulty.expectMessage("Difficulty should be between 1.2 and 3.8");

        DiversScore diver = new DiversScore();
        diver.setDiveDifficulty(3.9F);
    }

    @Test
    public void canCalculateScoreOfADive() {
        DiversScore diver = new DiversScore();
        float[] scores = {1.0F, 3.0F, 2.0F, 9.9F, 4.0F, 5.0F, 6.0F};
        diver.setScores(scores);
        diver.setDiveDifficulty(2.0F);

        float sum = diver.getDiveScore();
        assertEquals("Sum of scores for diver is", sum, 24.0F, 0.0);
    }
}