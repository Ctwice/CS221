/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d1;

/**
 *
 * @author Pandoras_Box
 */
public class LinearSearch {
    
    public boolean LinearSearch(int[] a, int pos, int val){
            if (pos >= a.length) 
                return false;
            else if  (a[pos] == val)
                return true;
            else return LinearSearch(a, pos +1, val);
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {1, 2, 3, 4, 7, 87, 4, 2};
        LinearSearch(a, int pos, 4);
    }
    
}
