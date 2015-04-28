/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monday;

import java.util.Scanner;

/**
 *
 * @author Pandoras_Box
 */
public class Evenodd {
    
    
    int zero;
    int odd;
    int even;
    
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("numbers: ");
        String name = in.nextLine();
        String[] nums = name.split("");

        for (int i = 0; i < nums.length; i++) {
            int nums = Integer.parseInt(nums[i]);
            
            if (nums[i] == 0){
                zero += 1;
            }
            if (i % 2 = 0){
                even +=1;
                }
            
        }
    }
}