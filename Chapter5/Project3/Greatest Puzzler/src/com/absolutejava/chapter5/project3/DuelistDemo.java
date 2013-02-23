/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.project3;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class DuelistDemo {

    public static void main(String[] args) {
        
        Duelist aaron = new Duelist("Aaron", 1.0 / 3.0);
        Duelist bob = new Duelist("Bob", 1.0 / 2.0);
        Duelist charlie = new Duelist("Charlie", 1.0);

        int aaronWins = 0;
        int bobWins = 0;
        int charlieWins = 0;

        int turn = 1;

        // simulates the duel 10 000 times
        for (int i = 0; i < 10000; i++) {
            while (Duelist.getTotalDeaths() < 2) {
                // they take turns, starting with aaron
                // the shooter's strategy is always to shoot the best Duelist
                //	out of who's left
                // aaron's strategy is to intentionally miss his 1st turn
                if (aaron.isAlive() && (Duelist.getTotalDeaths() < 2) && turn != 1) {
                    if (charlie.isAlive()) {
                        aaron.shootAtTarget(charlie);
                    } else {
                        aaron.shootAtTarget(bob);
                    }
                }
                if (bob.isAlive() && Duelist.getTotalDeaths() < 2) {
                    if (charlie.isAlive()) {
                        bob.shootAtTarget(charlie);
                    } else {
                        bob.shootAtTarget(aaron);
                    }
                }
                if (charlie.isAlive() && Duelist.getTotalDeaths() < 2) {
                    if (bob.isAlive()) {
                        charlie.shootAtTarget(bob);
                    } else {
                        charlie.shootAtTarget(aaron);
                    }
                }
                turn++;
            }

            // increments the only winner's wins by 1
            if (aaron.isAlive()) {
                aaronWins++;
            } else if (bob.isAlive()) {
                bobWins++;
            } else {
                charlieWins++;
            }

            // before the next duel simulation, all Duelists are resurrected
            aaron.resurrect();
            bob.resurrect();
            charlie.resurrect();

            // resets static int that tells when there's 1 Duelist remaining
            Duelist.resetDeaths();
            turn = 1;
        }

        System.out.println("Aaron wins " + aaronWins + " duels out of 10000.");
        System.out.println("Bob wins " + bobWins + " duels out of 10000.");
        System.out.println("Charlie wins " + charlieWins + " duels out of 10000.");

    }
}
