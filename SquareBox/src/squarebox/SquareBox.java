package squarebox;

import java.util.Scanner;

/**
 *
 * @author class
 */
public class SquareBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating square box
        System.out.println("Please enter an integer ");

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num < 15) {
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= num; j++) {
                    System.out.print("X");
                }

                System.out.println("");
            }
        } else {
            System.out.println("Error");
        }
    }

}
