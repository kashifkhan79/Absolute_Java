/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doublefilegenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class DoubleFileGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try (PrintWriter writer = new PrintWriter(new FileOutputStream("number.txt"))) {
            for (int i = 0; i < 30; i++) {
                writer.println(new DecimalFormat("#.##").format(new Random().nextDouble() * 30));
            }
        } catch (FileNotFoundException e) {
            System.out.println("exception");
        }
    }
}
