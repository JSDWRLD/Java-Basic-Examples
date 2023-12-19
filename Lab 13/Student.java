/* 
   12/7/23
   Lab 13: This is a class to create student objects to be used in 
   conjuction with the StudentGradesDong.java file
*/

public class Student {
	//initialize attributes
   private int studentId;
   private String name; 
   private int[] grades = new int[3];
   
   //Construct a new student with above implicit parameters
		//assign value of each parameter to the field of the same name
	public StudentDong(int studentId, String name, int[] grades) {
      this.studentId = studentId;
      this.name = name;
      for (int i = 0; i < grades.length; i++){
         this.grades[i] = grades[i];
      }
   }
	
   // define getters 
   public String getName(){
      return name;
   }
   
   public int getId(){
      return studentId;
   }
   
   // define setters
   public void setName(String name){
      this.name = name;
   }
   
   public void setId(int studentId){
      this.studentId = studentId;
   }
   
	//create a function that calculates and returns the average of the grades of each student
   public double calculateAverage(){
      double total = 0;
      for(int i = 0; i < grades.length; i++){
         total += grades[i];
      }
      
      return (double) total/grades.length;
   }
}
