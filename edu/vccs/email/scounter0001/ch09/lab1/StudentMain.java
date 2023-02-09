
package edu.vccs.email.scounter0001.ch09.lab1;
import java.util.Scanner;
/**
 * StudentMain class creates a class which will initialize and
 * use Student objects to store and display student names
 * and gpa's.
 * @date 02-08-2023
 * @author Samuel Counter
 * @author Erick Hernandez
 */
public class StudentMain {
   private static Scanner scanner; //declares a scanner object
   public static void main (String[] args){
    int numberOfStudents;         //amount that is to become student objects
    double gPA;                   //gpa of a specific student
    String firstName;             //first name of a specific student
    String lastName;              //last name of a specific student
    int i;                        //increments the for loops
   
    
    scanner  = new Scanner(System.in);
    System.out.print("Enter the number of students: ");
    numberOfStudents = scanner.nextInt();
    Student [] studentList = new Student [numberOfStudents]; 
    for (i=0; i < numberOfStudents; ++i) {       // enter a for loop to add student objects
    System.out.print("Enter first name for student #" + (i+1) +": " );
    firstName = scanner.next();
    System.out.print("Enter last name of student #" + (i+1) +": ");
    lastName = scanner.next();
    System.out.print("Enter GPA for student #" + (i+1) +": ");
    gPA = scanner.nextDouble();
    studentList[i] = new Student (); //create new student object
    studentList[i].setLastName(lastName);
    studentList[i].setFirstName(firstName);
    studentList[i].setGPA(gPA);                              
    }
    for (i=0; i < numberOfStudents; ++i){ //for loop prints out student name and gpa
    System.out.print(studentList[i].getFirstName() + " ");
    System.out.print(studentList[i].getLastName() + " " + "GPA: ");
    System.out.println(studentList[i].getGPA()); 
   }
    

    
    
    }
}