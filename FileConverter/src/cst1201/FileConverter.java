/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cst1201;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author class
 */
public class FileConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Please enter the path of the input file: ");
        
        //connect a scanner to standard input
        Scanner keyboard = new Scanner(System.in);
        
        //connect a scanner to standard input
        String inputFilePath = keyboard.nextLine();
        
        System.out.print("please enter the path of the output file: ");
        
        String outputFilePath = keyboard.nextLine();
        
        File inputFile  = new File(inputFilePath);
        Scanner inputFileScanner = new Scanner(inputFile);
        
        //while there are more lines.
        while (inputFileScanner.hasNextLine()) {
            //get the next one.
            String line = inputFileScanner.nextLine();
            //convert to uppercase.
            String upperCaseLine = line.toUpperCase();
            
            System.out.println(upperCaseLine);
        }
        
    }
    
}
