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
public class StudentArray {

    private Student[] a;
    private int nElems;

    public StudentArray(int max) {
        a = new Student[max];
        nElems = 0;
    }

    public Student find(int id) {

        int j;

        for (j = 0; j < nElems; j++) {
            if (a[j].getID() == id) {
                break;
            }
        }
        if (j == nElems) {
            return null;

        } else {
            return a[j];

        }
    }

    public void insert(int id, String name, int mark) {

        int j;

        for (j = 0; j < nElems; j++) {
            if (a[j].getID() == id) {
                break;
            }
        }
        if (j == nElems) {
            a[nElems] = new Student(id, name, mark);
            nElems++;
        } else {
            System.out.println("Duplicate ID");
        }
    }

    public boolean delete(int id) {

        int j;

        for (j = 0; j < nElems; j++) {
            if (a[j].getID() == id) {
                break;
            }

        }
        if (j == nElems) {
            return false;

        } else {
            for (int k = j; k < nElems; k++) {
                a[k] = a[k + 1];

            }
            nElems--;
            return true;
        }
    }

    public int Mark(int i) {
        int grade = a[i].getMark();
        return grade;
    }

    public String Name(int i) {
        String name = a[i].getName();
        return name;
    }
    
    public void displayAll() {
        for (int j = 0; j < nElems; j++) {
            a[j].displayStudent();
        }
    }



//__________________________________________

    public static void main(String[] args) {

        StudentArray arr;
        int max = 100;
        arr = new StudentArray(max);
        

        
        arr.insert(01, "Fred", 6);
        arr.insert(02, "Tom", 1);
        arr.insert(03, "Joan", 5);
        arr.insert(04, "katie", 6);
        arr.insert(05, "Jorry", 8);
        arr.insert(06, "zach", 9);
        arr.insert(07, "erick", 3);
        arr.insert(11, "ryan", 4);
        arr.insert(12, "ashley", 5);
        arr.insert(10, "tim", 7);
        


        arr.displayAll();
        System.out.println();
        
        int searchKey = 01;
        Student found;
        found = arr.find(searchKey);
        
        if (found != null) {
            System.out.print("found");
            found.displayStudent();
            
        } else {
            System.out.println(searchKey + "not valid");
            
            
        }
        System.out.println();
        
        int high = 0;
        int low = 100;
        int[] tempArr = new int[max];
        
        for (int i = 0; i < arr.nElems; i++) {
            tempArr[i] = arr.Mark(i);
            
        }
        for (int k = 0; k < arr.nElems; k++) {
            if (tempArr[k] < low) {
                low = tempArr[k];
            }
            
         }
        for (int w = 0; w < arr.nElems; w++) {
            if (arr.Mark(w) == low) {
                System.out.println("Lowest Grade was: " + arr.Name(w));
                
            
            }
            if (arr.Mark(w) == high) {
                System.out.println("Highest Grade was: " + arr.Name(w));
            
            }
            
            System.out.println();
            
            
            System.out.println("Delete 01, 02, 03 , 04");
            arr.delete(01);
            arr.delete(02);
            arr.delete(03);
            arr.delete(04);
            
            System.out.println();
            arr.displayAll();
            
         
            }
    }
        
        
}
