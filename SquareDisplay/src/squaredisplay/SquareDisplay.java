/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squaredisplay;

import java.util.Scanner;

/**
 *
 * @author GKundu
 */
public class SquareDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ask User To Input Number 
        System.out.print("Please Enter a positive number less than 15: ");
        int enterNumber = sc.nextInt();

        //Show Error When User Type Any Number Higher Then 15
        while (enterNumber > 15 || enterNumber < 1) {
            System.out.println("Incorrect.Please enter another positive number less than 15");
            System.out.print("Please enter the nuumber here: ");
            enterNumber = sc.nextInt();
        }
        //Print Square 
        System.out.println("\n" + "HERE IS THE SQUARE: ");

        for (int raw = 1; raw <= enterNumber; raw++) {
            for (int column = 1; column <= enterNumber; column++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
