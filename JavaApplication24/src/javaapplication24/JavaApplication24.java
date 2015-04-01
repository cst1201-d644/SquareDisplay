package javaapplication24;

import java.util.Scanner;

public class JavaApplication24 {

    public static void main(String[] args) {
        //1. Get input from user.
        System.out.print("Please enter a positive integer less than or equal to 15: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        
        
         while (inputNumber < 1 || inputNumber > 15) {
            System.out.print("Incorrect. Please enter another number: ");
            inputNumber = scanner.nextInt();
            
        }
        for (int i = 1; i <= inputNumber; i++) {
            for (int j = 1; j <= inputNumber; j++) {
                System.out.print("X");
            }
            System.out.println();

        }
        while (inputNumber < 1 || inputNumber > 15) {
            System.out.print("Incorrect. Please enter another number: ");
            inputNumber = scanner.nextInt();
            
        }

        //At this point, I should have a valid input.
        //2. Draw the square.
    }

}
