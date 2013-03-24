/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.absolutejava.chapter8.project1.videogame.launcher;

import com.absolutejava.chapter8.project1.videogame.entities.Alien;
import com.absolutejava.chapter8.project1.videogame.entities.AlienPack;
import com.absolutejava.chapter8.project1.videogame.entities.MarshmallowMan;
import com.absolutejava.chapter8.project1.videogame.entities.Ogre;
import com.absolutejava.chapter8.project1.videogame.entities.Snake;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class AlienLauncher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AlienPack pack = new AlienPack(4);

        Snake snakey = new Snake(10, "Snakey");
        Ogre  ogrey = new Ogre(25, "Ogrey");
        MarshmallowMan marshy = new MarshmallowMan(75, "MarshyMan");
        Snake python = new Snake(85, "Python");

        pack.addAlien(snakey, 0);
        pack.addAlien(ogrey, 1);
        pack.addAlien(marshy, 2);
        pack.addAlien(python, 3);

        System.out.println("The aliens in this pack are");
        Alien[] aliens = pack.getAliens();

        for(Alien a : aliens)
        {
            System.out.println(a.getName() + " with health of " + a.getHealth());
        }
        
        System.out.println("Total damage done by this pack is : " + pack.calculateDamage());

    }

}
