/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squaredisplay;

import java.util.Scanner;

/**
 *
 * @author class
 */
public class SquareDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int userInput;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a positive number no greater than 15: ");
        userInput = keyboard.nextInt();
        int i;
        int j;
        if (userInput <= 15 && userInput > 0) {
            for (j = 0; j < userInput; j++) {
                if (j < userInput) {
                    for (i = 0; i < userInput; i++) {
                        if (i < userInput) {
                            System.out.print("x");
                        }
                    }
                }
                System.out.println();
            }
        } else {
            System.err.println("The number is out of range.");
        }
    }
}
    
