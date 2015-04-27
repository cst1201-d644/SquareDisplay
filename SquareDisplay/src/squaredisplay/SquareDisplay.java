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
    private static int InputNumber;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter a positive integer less than or equal to 15: ");
Scanner scanner = new Scanner(System.in);
int inputNumber = scanner.nextInt();
while (inputNumber < 1 || inputNumber > 15) {
System.out.print("Incorrect. Enter another number: ");
InputNumber = scanner.nextInt();
}
for (int i = 0; i < inputNumber; i++) {
for (int i2 = 0; i2 < inputNumber; i2++) {
System.out.print("X");
}
System.out.println();
}
    }
    