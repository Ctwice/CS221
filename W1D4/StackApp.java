/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thursday;

import java.util.Scanner;

/**
 *
 * @author Pandoras_Box
 */
public class StackApp {

    private int maxSize;        // size of stack array
    private long[] stackArray;
    private int top;            // top of stack
//--------------------------------------------------------------

    public StackApp(int s) // constructor
    {
        maxSize = s;             // set array size
        stackArray = new long[maxSize];  // create array
        top = -1;                // no items yet
    }

//--------------------------------------------------------------
    public void push(long j) // put item on top of stack
    {
        stackArray[++top] = j;     // increment top, insert item
    }

//--------------------------------------------------------------
    public long pop() // take item from top of stack
    {
        return stackArray[top--];  // access item, decrement top
    }

//--------------------------------------------------------------
    public long peek() // peek at top of stack
    {
        return stackArray[top];
    }
//--------------------------------------------------------------

    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }
//--------------------------------------------------------------

    public boolean isFull() // true if stack is full
    {
        return (top == maxSize - 1);
    }

    public String toString() {
        String out = "";
        for (int i = top; i >= 0; i--) {
            out = out + stackArray[i] + " ";
        }

        return "[ " + out + "]";
    }

//--------------------------------------------------------------
}  // end class StackX 
////////////////////////////////////////////////////////////////

class StackAppDriver {

    public static void main(String[] args) {
        
        String input, output;
        
            StackApp(20);
            
            while (true) {
            
            
            
            System.out.println("Pop, Push or Peek? ");
            Scanner in = new Scanner(System.in);
            input = in.next();
            if (input.equals("quit"))
                break;
            if (input == "Pop" || input == "pop") {
                StackArray.pop();
            }
            
      
        
        
        
        }
    }  // end main()

}
