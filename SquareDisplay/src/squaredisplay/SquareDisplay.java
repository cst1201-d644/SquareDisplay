/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squaredisplay;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SquareDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a positive integer no greater than 15:");
        int integer = keyboard.nextInt();

        while (integer < 1 || integer > 15) {
            System.out.println("Enter a postitve integer no greater than 15 again:");
            integer = keyboard.nextInt();
        }
        for (int i = 0; i < integer; i++) {
            for (int i2 = 0; i2 < integer; i2++) {
                System.out.print("x");}
                System.out.println();
            }
        }

    }

