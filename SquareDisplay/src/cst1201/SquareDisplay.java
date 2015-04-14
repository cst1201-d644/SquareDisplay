package cst1201;

import javax.swing.JOptionPane;

public class SquareDisplay {

    public static void main(String[] args) {
        String output;
        String userInput = " ";
        int number;
        int counterOne;
        int counterTwo;
        boolean done = false;

        userInput = JOptionPane.showInputDialog("Please enter a value 1-15: ");
        number = Integer.parseInt(userInput);

        while (!done) {
            if (number >= 1 && number <= 15) {

                for (counterOne = 0; counterOne < number; counterOne++) {

                    for (counterTwo = 0; counterTwo < number; counterTwo++) {
                        System.out.print("X");
                    }

                    System.out.print("\n");
                }
                
                done = true;
            } else {
                userInput = JOptionPane.showInputDialog("Number invalid, 1-15 please: ");
                number = Integer.parseInt(userInput);
            }
        }
    }
}
