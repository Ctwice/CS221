/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author Pandoras_Box
 */
public class LinkedList {

    private Link first;            // ref to first link on list
    public int nodes;
    
    public int size(){
        return nodes;
    }
    
  
    // -------------------------------------------------------------
    public LinkList() // constructor
    {
        first = null;               // no links on list yet
    }

    // -------------------------------------------------------------

    public boolean isEmpty() // true if list is empty
    {
        return (first == null);
    }
		// -------------------------------------------------------------
    // insert at start of list

    public void insertFirst(int id, double dd) {                           // make new link
        Link newLink = new Link(id, dd);
        newLink.next = first;       // newLink --> old first
        first = newLink;            // first --> newLink
        nodes++;
    }

    // -------------------------------------------------------------

    public Link deleteFirst() // delete first item
    {                           // (assumes list not empty)
        Link temp = first;          // save reference to link
        first = first.next;         // delete it: first-->old next
        nodes--;
        return temp;                // return deleted link
        
    }

    // -------------------------------------------------------------

      public boolean find(int key){
        if (first == key)
            return true;
        else 
            if (newLink.next == key);
    
    }
      
    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;       // start at beginning of list
        while (current != null) // until end of list,
        {
            current.displayLink();   // print data
            current = current.next;  // move to next link
        }
        System.out.println("");
    }
    // -------------------------------------------------------------
}  // end class LinkList
