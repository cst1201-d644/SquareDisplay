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
        //Ask user for Positive integer no greater than 15
        //Display an 'X' on the screen
        //Make the length of the X's match the number entered
        System.out.println("Please enter a positive integer less than 15: ");
        Scanner Scanner = new Scanner(System.in);
        int num = Scanner.nextInt();
        if (num < 15) {
            for (int a = 1; a <= num; a++) {
                for (int b = 1; b <= num; b++) {
                    System.out.print("X");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Error, please try again!");
        }
              

    }}
            
        
    }
    
}
