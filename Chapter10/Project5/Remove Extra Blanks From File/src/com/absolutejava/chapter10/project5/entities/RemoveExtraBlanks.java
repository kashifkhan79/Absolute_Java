/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter10.project5.entities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class RemoveExtraBlanks {

    private static final String originalFile = "Extra_Blanks_File.txt";
    private static final String newFile = "src/data/Saying.txt";        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        PrintWriter outputStream = null;
        Scanner inputStream = null;        
        
        String tempFileName = System.currentTimeMillis() + ".txt";
        File tempFile = new File("src/data/".concat(tempFileName));
        
        try
        {
            inputStream = new Scanner(new FileInputStream(originalFile));
            outputStream = new PrintWriter(new FileOutputStream(tempFile));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error oppening files");
            System.exit(0);
        }
        
        writeContentsToTempFile(inputStream, outputStream);
        
        try
        {
           inputStream = new Scanner(new FileInputStream(tempFile));
           outputStream = new PrintWriter(new FileOutputStream(newFile));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error oppening files");
            System.exit(0);
        }
        
        updateOriginalFile(inputStream, outputStream);
        
        inputStream.close();        
        outputStream.close();
        
        deleteTempFile(tempFile);                
    }

    private static void writeContentsToTempFile(Scanner inputStream, PrintWriter outputStream) {
        String line = null;
        while(inputStream.hasNextLine())
        {
            String regexp = "\\s+";
            line = inputStream.nextLine().replaceAll(regexp, " ");
            if(!line.isEmpty())
            {
                outputStream.println(line);
            }            
        }
        
        inputStream.close();
        outputStream.close();
    }

    private static void updateOriginalFile(Scanner inputStream, PrintWriter outputStream) {
        while(inputStream.hasNextLine())
        {
            outputStream.println(inputStream.nextLine());
        }
    }

    private static void deleteTempFile(File fileObject) {
        if(fileObject.delete())
        {
            System.out.println(fileObject.toString() + " has been deleted");
        }
    }
}
