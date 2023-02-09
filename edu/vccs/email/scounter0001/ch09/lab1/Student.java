
package edu.vccs.email.scounter0001.ch09.lab1;
/**
 * Class Student creates a student class which will
 * store a persons first and last name and hold in 
 * in memory a persons gpa.
 * @date 02-08-2023
 * @author Samuel Counter
 * @author Erick Hernandez
 */
public class Student {
  public static final double MIN_GPA = 0.0;    // min gpa constant amount for if statement 
  public static final double MAX_GPA = 4.0;    // max gpa constant amount for if statement
  private String lastname;                      // last name of the student object 
  private String firstname;                     // first name of the student object
  private double gpa ;                          // gpa amount of the student object

 /**
  * method setLastName accepts a last name from user
  * and assigns it to lastname
  * @param lname
  * @return unused
  */
  public void setLastName(String lname){
        lastname = lname;
  }
  /**
   * method getLastName returns the lastname of a Student
   * @param unused
   * @return lastname
   */
  public String getLastName(){
        return lastname;
  }
  /**
   * method setFirstName accepts a first name from the user
   * and assigns it to firstname 
   * @param fname
   * @return unused
   */
  public void setFirstName(String fname){
        firstname = fname;
  }
 /**
  * method getFirstName returns the first name of
  * the student
  * @param unused
  * @return firstname
  */
  public String getFirstName(){
        return firstname;

  }
  /**
   * method accepts gpa of student and assigns conditions
   * on what that gpa can be, between zero and 4.0, and then
   * assigns the gpa value to gpa
   * @param studentGPA
   * @return unused
   */
  public void setGPA(double studentGPA){
        if (studentGPA <= MAX_GPA && studentGPA >= MIN_GPA){
            gpa = studentGPA;
             }
        if (studentGPA < 0) {
                gpa = 0.0;
            }
            
        else if (studentGPA > 4.0) {
            gpa = 4.0;
        }
  }
 /**
  * method gets the value of gpa and returns this value 
  *@param unused 
  *@return gpa
  */
  public double getGPA(){
      return gpa;
  }

}
