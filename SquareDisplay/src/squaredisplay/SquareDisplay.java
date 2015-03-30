/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package squaredisplay;
import java.util.Scanner;
/**
 *
 * @author JianLang Lin
 */
public class SquareDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;
        System.out.print("Enter a positive number and not greater than 15  : ");
        input=keyboard.nextInt();
        while(input<1 || input>15){
        System.out.print("incorrect,please enter another integer  : ");
        input=keyboard.nextInt();
        }
            for (int i=0;i<input;i++){
                for(int i2=0;i2<input;i2++){
                    System.out.print("X");}
                System.out.println();
        }
    }
    
}
