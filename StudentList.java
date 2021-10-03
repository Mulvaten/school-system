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
public class StudentList {
    Student first;
    
    public StudentList(){
        first = null;
    }
    
    public void insertStudent(String name, int id, double gpa){ //We need to make sure to insertion sort
        Student newStudent = new Student(name, id, gpa);
        Student previousStudent = null;
        Student currentStudent = first;
        
        while (currentStudent != null && id > currentStudent.id){
            previousStudent = currentStudent;
            currentStudent = currentStudent.next;
        }
        
        if(previousStudent == null)
            first = newStudent;
        else
            previousStudent.next = newStudent;
        newStudent.next = currentStudent;
    }
    
    public void displayList(){
        Student currentStudent = first;
        if (currentStudent == null){
            System.out.println("The list is empty.");
        }else{
            while (currentStudent != null){
                currentStudent.displayData();
                currentStudent = currentStudent.getNext();
            }
        }
        System.out.println("Operation complete.");
    }
    
    public void findStudent(int key){
        Student currentStudent = first;
        if (currentStudent == null){
            System.out.println("The list is empty.");
        }else{
            while (currentStudent.id != key){
                if (currentStudent.next == null){
                    System.out.println("Node not in structure.");
                }else
                    currentStudent = currentStudent.next;
            }
            currentStudent.displayData();
            System.out.println("Operation complete.");
        }
    }
    
    public void deleteStudent(int key){
        Student currentStudent = first;
        Student previousStudent = first;
        if (currentStudent == null){
            System.out.println("The list is empty.");
        }else{
            while (currentStudent.id != key){
                if (currentStudent.next == null){
                    System.out.println("Node not in structure.");
                }else{
                    previousStudent = currentStudent;
                    currentStudent = currentStudent.next;
                }
            }
            if (currentStudent == first)
                first = first.next;
            previousStudent.next = currentStudent.next;
            System.out.println("Operation complete.");
        }
    }
    
    public void updateStudent(int key, String na, int id, double g){
        Student currentStudent = first;
        if (currentStudent == null){
            System.out.println("The list is empty.");
        }else{
            while (currentStudent.id != key){
                if (currentStudent.next == null){
                    System.out.println("Node not in structure.");
                }else
                    currentStudent = currentStudent.next;
            }
            currentStudent.updateInfo(na, id, g);
            System.out.println("Operation complete.");
        }
    }
    
}
