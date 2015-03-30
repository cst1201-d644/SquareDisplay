/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package squaredisplaylab;

import java.util.Scanner;

/**
 *
 * @author class
 */
public class SquareDisplayLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int integer = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a positive integer less than 15: ");
        integer = keyboard.nextInt();
        while (integer < 1 || integer > 15 )
            System.out.println("Incorrect, please enter another number! ");
        
            
        
    }
    
}
