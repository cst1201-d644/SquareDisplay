
package squaredisplay;

import javax.swing.JOptionPane;

/**
 *
 * @author Osthir Nobin
 */
public class SquareDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String userInput;
        String output =" ";
        int number ;
        int counterOne;
        int counterTwo;
        
        
        userInput =JOptionPane.showInputDialog("Please enter a value 1-15: ");
            
       number = Integer.parseInt(userInput);
        
        
        if (number >=1 && number <=15){
            
            for(counterOne = 0; counterOne < number; counterOne++){
                
                for(counterTwo = 0; counterTwo < number; counterTwo++){
                    System.out.print("X");
                }
                
                System.out.print("\n");
            }
            System.exit(0);
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Invalid number");
        }
    }
    
    
}
