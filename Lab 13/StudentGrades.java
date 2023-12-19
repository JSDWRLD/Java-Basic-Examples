/* 
   12/7/23
   Lab 13: This program that manages student data and calculates their average
   grades. Students' information is stored in a file, read by the program, and the results are
   displayed and saved in another file.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class StudentGrades {

   public static void main(String args[]){
   
   // variables for file names to find with ease
   File input = new File("student.txt");
   File output = new File("output.txt");
   
      try {
      // creating a scanner to read file and a printwriter to write a new file
      Scanner studentInfo = new Scanner(input);
      PrintWriter write = new PrintWriter(output);
      
      
		// initialize index and creating a array of student objects
      int index = 0;
      StudentDong[] students = new StudentDong[6];
	
         // while loop to keep reading the file
   	   while(studentInfo.hasNext()){
            int id = studentInfo.nextInt(); 
            String name = studentInfo.next();
            int[] grades = new int[3];
            
            // for loop that iterates through the array and reads in the next 3 ints which are grades
            for (int i = 0; i < grades.length; i++){
               grades[i] = studentInfo.nextInt();
            }
            
            // adding students to the array and incrementing index up
            students[index] = new StudentDong(id, name, grades);
            index++;
            
            // using built in calculateAverage method to print out
            double currentAvg = students[index-1].calculateAverage();
            System.out.println("Student " + id + ": " + name + " - Average Grade: " + currentAvg);
            
   			// writing the data to the output file 
            write.println("Student " + id + ": " + name + " - Average Grade: " + currentAvg);
            
            
   		}
         
	      // call displayHighestAverage function and write
         System.out.println("\n" + displayHighestAverage(students));
         write.println("\n" + displayHighestAverage(students));
         
   		studentInfo.close();
         write.close();
	   
      } catch (FileNotFoundException e) {
                  // catch File Not Found
                  System.err.println("File not found");
      }
	}
	
   // Method that will display the student with the highest average that takes an array of student objs as a parameter
   private static String displayHighestAverage(StudentDong[] students){

		//initialize a double variable to hold highest avg
      double highestAvg = 0;
      StudentDong highestAvgStudent = null;
      
      // for loop to iterate through each student object in the object array
	   for(int i = 0; i < students.length; i++){
         if(students[i] != null){
            // using the calculateAverage function to store the current average of the student
            double average = students[i].calculateAverage();
            
            // compare the avg to the highest one and replaces accordingly
            if (average > highestAvg){
               highestAvg = average;
               
               // updates empty student object to current one
               highestAvgStudent = students[i];
            }
         }
      }
      
      // after for loop if the highestAvgStudent object is not null then we will return a string
      if (highestAvgStudent != null){
         return "Student with the highest average grade: " + highestAvgStudent.getId() + ": " + highestAvgStudent.getName() + " - Average Grade: " + highestAvg;
      } else {
         return "No Student Found";
      }
      
   }
}
