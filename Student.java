
/**
 * This class holds information for a Student.
 * It is used to demonstrate the use of arrays
 * 
 * @author ArionAlmond 
 * @version 3/15/16
 */

import java.util.Scanner;
public class Student
{
	private String lName;
	private String fName;
	private double[ ] grades; //this creates a reference variable
	
  public Student(String inlName, String infName, int numberOfGrades)
	{
	    lName = new String(inlName);
	    fName = infName;
	    grades = new double[numberOfGrades];//this create an array
	}
	
	//write a method setGrades which takes as a parameter an array
	
	public void setGrades(double[ ] inGrades)
	{
	   //this loop goes thru each elment from the parameter and assigns its value to the corresponding
	   //element of the array of grades for one Student
	    for(int i = 0; i < inGrades.length; i++)
	   {
	       grades[i] = inGrades[i];
	   }
	}
	
	

	//This overloaded method  of setGrades which reads the grades using keyboard input
	
	@SuppressWarnings("resource")
	public void setGrades( )
	{
	    Scanner keyboard = new Scanner(System.in);
	    
	    for(int i = 0; i < grades.length; i++)
	    {
	        System.out.println("Enter grade " + (i + 1) + ": ");
	        grades[i] = keyboard.nextDouble( );
	     }
	   }     
	
	//This method loops through the array of grades, accumulates the
	//grades, then calculates and returns the average
	
	public double getAverage( )
	{
	    double average;
	    double sum = 0;
	    
	   for(int i = 0 ; i < grades.length; i++)
	   {
	       sum += grades[i];
	   }
	    
	    average = sum/grades.length;
	    return average;
	  }
	  
	  public String toString( )
	  {
	      return "First: " + fName + "\tLast: " + lName + "\tAverage: " + getAverage( );
	  }
	  
	  public double[ ]  getGrades( )
	  {
	      return grades;
	  }    
	  
}//end of class definition
	
	
	
	
	
	
	
	
	