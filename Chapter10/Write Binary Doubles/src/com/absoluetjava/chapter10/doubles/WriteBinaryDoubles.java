/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absoluetjava.chapter10.doubles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class WriteBinaryDoubles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("doubles.dat")))
        {
            for(int i = 0; i < 10; i++)
            {
                outputStream.writeDouble(Double.parseDouble(new DecimalFormat("#.##").format(new Random().nextDouble() * 100)));
            }
        }
        catch(IOException e)
        {
            System.out.println("IO Exception occured");
        }
    }
}
