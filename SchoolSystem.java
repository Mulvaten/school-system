//Author: Tyler Stratton
//Purpose: The purpose of this project is to allow a school to keep track of student information, including name, ID number, and GPA.
package SchoolSystem;

import java.util.Scanner;
public class SchoolSystem {
    public static void main(String[] args) {
        StudentList sList = new StudentList();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter the number of students.");
        int stu = in.nextInt();
        
        while(stu < 1){
            System.out.println("The number of students cannot be less than one. Please enter a new value.");
            stu = in.nextInt();
        }
        
        for (int i = 1; i <= stu; i++){
            System.out.println("Please enter student " + i + "'s name.");
            String name = in.nextLine();
            System.out.println("Please enter student " + i + "'s ID number.");
            int id = in.nextInt();
            System.out.println("Please enter student " + i + "'s GPA.");
            double gpa = in.nextDouble();
            
            sList.insertStudent(name, id, gpa);
        }
        
        int choice;
        
        do{
            System.out.println("Main menu");
            System.out.println("1. Insert a new student's information.");
            System.out.println("2. Find a student's information.");
            System.out.println("3. Delete a student's information.");
            System.out.println("4. Update a student's information.");
            System.out.println("5. Output a list of all students.");
            System.out.println("6. Exit.");
            System.out.println("Please make a selection: ");
            choice = in.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Please enter the student's name: ");
                    String name = in.nextLine();
                    System.out.println("Please enter the student's ID number: ");
                    int id = in.nextInt();
                    System.out.println("Please enter the student's GPA: ");
                    double gpa = in.nextDouble();
                    sList.insertStudent(name, id, gpa);
                    break;
                case 2:
                    System.out.println("Please enter the student to find's ID number: ");
                    id = in.nextInt();
                    sList.findStudent(id);
                    break;
                case 3:
                    System.out.println("Please enter the ID number of the student to be deleted: ");
                    id = in.nextInt();
                    sList.deleteStudent(id);
                    break;
                case 4:
                    System.out.println("Please enter the ID number of the student to be updated: ");
                    id = in.nextInt();
                    System.out.println("Please enter the new name to be entered: ");
                    String newName = in.nextLine();
                    System.out.println("Please enter the new ID number to be entered: ");
                    int newID = in.nextInt();
                    System.out.println("Please enter the new GPA to be entered: ");
                    double newGpa = in.nextDouble();
                    sList.updateStudent(id, newName, newID, newGpa);
                    break;
                case 5:
                    sList.displayList();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("You have entered an invalid value. Please try again.");
            }
        }while(choice != 6);
    }
}
