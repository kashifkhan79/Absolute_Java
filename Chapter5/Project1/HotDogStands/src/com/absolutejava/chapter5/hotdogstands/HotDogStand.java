/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.hotdogstands;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class HotDogStand {

    private int numberOfHotDogsSoldThatDay;
    private int hotDogStandId;
    private static final int ONE_HOT_DOG_SOLD = 1;
    private static int numberOfAllHotDogsSold;

    public HotDogStand() {
        this(-1);
    }

    public HotDogStand(int hotDogStandId) {
        this(hotDogStandId, 0);
    }

    public HotDogStand(int hotDogStandId, int numberOfHotDogsSoldThatDay) {
        this.hotDogStandId = hotDogStandId;
        this.numberOfHotDogsSoldThatDay = numberOfHotDogsSoldThatDay;
        setAllHotDogsSold(numberOfHotDogsSoldThatDay);
    }

    public void justSold() {
        numberOfHotDogsSoldThatDay++;
        setAllHotDogsSold(ONE_HOT_DOG_SOLD);
    }

    public int getNumberOfHotDogsSold() {
        return numberOfHotDogsSoldThatDay;
    }

    public static int getAllHotDogsSold() {
        return numberOfAllHotDogsSold;
    }

    private static void setAllHotDogsSold(int numberOfHotDogsSold) {
        numberOfAllHotDogsSold += numberOfHotDogsSold;
    }

    public static void resetAllHotDogsSold() {
        numberOfAllHotDogsSold = 0;
    }
}
