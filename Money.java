/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monday;

import java.util.Scanner;

/**vv
 *
 * @author Pandoras_Box
 */

public class Money {

    int mon; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner mon = new Scanner(System.in);
        System.out.print("Dollar amount: ");
        String amount = mon.nextLine();
        double amounts = Double.parseDouble(amount);
        
        int dollars;
        int quarters;
        int nickels;
        int dimes;
        int pennies;
        
        dollars = amounts % 1;
        System.out.println(amounts);
    }
    
}
