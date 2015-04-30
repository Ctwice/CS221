/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wednesday;

/**
 *
 * @author Pandoras_Box
 */
public class Student {
    private int id;
    private String name;
    private int mark;

public Student(int id, String name, int mark){

this.id = id;
this.name = name;
this.mark = mark;

}

public void displayStudent(){

System.out.println("id: " + id + "name: " + name + "mark: " +mark);
}

public int getMark(){
    return mark;
}

public int getID(){
    return id;
}

public String getName(){
    return name;
}

}