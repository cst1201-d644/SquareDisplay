/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squaredisplay;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class SquareDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int raw;
        int column; 

        //for user input
        Scanner sc = new Scanner(System.in);

        //ask the user for the positive integer
        System.out.print("Enter a positive integer no greater than 15  ");
        System.out.println();
        int squareSize = sc.nextInt();
        while (squareSize < 1 || squareSize > 15) {
            System.out.print("Incorrect. Please enter another number");
            squareSize = sc.nextInt();
        }
        
//display the square
        for (raw=0; raw<squareSize; raw++) {
            
         for (column=0; column<squareSize; column++){
            { System.out.println("X");
        }
        
    }
}
    }}