/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cst1201;

import java.util.Scanner;

/**
 *
 * @author class
 */
public class SquareDisplayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Enter a positive integer <= 15: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        
        while (input < 1 || input > 15){
            System.out.print("Incorrect. Please enter another number: ");
            input = scan.nextInt();
        }
        
        for (int i = 0; i < input; i++){
            System.out.print("X");
            for (int j 
        }
        System.out.println();
    }
    
}
