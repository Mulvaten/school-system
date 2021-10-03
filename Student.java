/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchoolSystem;

/**
 *
 * @author Tyler
 */
public class Student {
    String name;
    int id;
    double gpa;
    Student next;
    
    public Student(String n, int i, double g){
        name = n;
        id = i;
        gpa = g;
        next = null;
    }
    
    public void setNext(Student s){
        next = s;
    }
    
    public void updateInfo(String n, int i, double g){
        name = n;
        id = i;
        gpa = g;
    }
    
    public Student getNext(){
        return next;
    }
    
    public void displayData(){
        System.out.printf(" %20s %6d %1.1f", name, id, gpa);
    }
}
