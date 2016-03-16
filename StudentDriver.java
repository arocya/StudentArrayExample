

import java.util.Scanner;
/**
 * This class illustrates creating an
 * array of object references.
 * 
 * @author Arion Almond
 * @version 3/15/16
 */
public class StudentDriver
{
	@SuppressWarnings("resource")
	public static void main(String[ ]  args)
	{
	    Scanner keyboard = new Scanner(System.in);
	    Student[ ]  myRoster; //a reference to an array of Student objects
	    double [ ] inputGrades;//a reference to an array that will hold doubles
	    int inputCount; //I will use this to hold the number of grades each student has
	    String inLast;//I will use this to read in a name and send to Student constructor
	    String inFirst;
	    //double [ ] testReturnArray;//I will use this to read in an array of grades to send to the Student constructor
	    
	    System.out.println("Enter the number of students enrolled in the course: ");
	    inputCount = keyboard.nextInt( );
	    
	    myRoster = new Student[inputCount];//create the array to hold Student references
	    
	    System.out.println("Enter the number of grades each student has: ");
	    inputCount = keyboard.nextInt( );
	    //create the array using the number of grades entered by the user
	    inputGrades = new double[inputCount];
	    
	    //now create the Student objects and assign each object address to the reference array
	    for(int i = 0; i < myRoster.length; i++)
	    {
	        keyboard.nextLine();
	        System.out.println("Enter student " + (i+1) + "\'s last name: ");
	        inLast = keyboard.nextLine( );
	        
	        System.out.println("Enter student " + (i+1) + "\'s first name: ");
	        inFirst = keyboard.nextLine( );
	        myRoster[i] = new Student(inLast, inFirst, inputCount); //create a Student object
	       
	        //this inner loop is used to read grades for one Student object
	        for(int k = 0; k < inputGrades.length; k++)
	        {
	            System.out.println("Enter grade " + (k+1)+ " for student " + (i+1) + ": ");
	            inputGrades[k] = keyboard.nextInt();
	        }//end of for loop to read and set grades
	        myRoster[i].setGrades(inputGrades);//cal the setGrades and send in the array of double as the parameter
	     }//end of for loop to create Students
	     
// 	     testReturnArray =  myRoster[0].getGrades( );
// 	     for(int i = 0; i < testReturnArray.length; i++)
// 	     {
// 	         System.out.println(testReturnArray[i]);
// 	     }    
	    
	    for(int i = 0; i < myRoster.length; i++)
	    {
	        System.out.println(myRoster[i]);
	    }
	        
	}//end of main
}//end of class definition
