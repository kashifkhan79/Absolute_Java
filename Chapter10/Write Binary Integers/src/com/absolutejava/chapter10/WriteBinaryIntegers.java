/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class WriteBinaryIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random random = new Random();        
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("integers.dat"))) 
        {
            for (int i = 0; i < 10; i++) 
            {
                outputStream.writeInt(random.nextInt(100));
            }
        }
        catch(IOException e)
        {
            System.out.println("Exception occured");
        }
    }
}