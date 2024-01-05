/* 
   9/29/23
   Lab 5: This program will take a set of two coordinates on the XY plane and 
   caculate the distance between the two points then caculates the circumference of a circle.
*/


public class CircumferenceHelper {
   public static void main (String args []){
      caculateThreeCircumference();
   }   
   
   // method  that calls caculateCircumference the loop 3 times
   public static void caculateThreeCircumference(){
      System.out.println("This program calculates the radius and circumference of a circle given center and a point on the circumference");
      System.out.println();
      
      // declare the variables and points
      int x1 = 2;
      int y1 = 4;
      int x2 = 2;
      int y2 = 8;
      
      // display the variables
      System.out.println("The coordinates of the center are : (" + x1 + ", " + y1 + ")");
      System.out.println("The coordinates of the point on the circumference are : (" + x2 + ", " + y2+ ")");
      // call calculate radius
      caculateCircumference(x1, y1, x2, y2);
      endLine();

   }
   
   public static void caculateCircumference(int x1, int y1, int x2, int y2){
      // calls 3 methods while passing each one through
      double radius = caculateRadius(x1, y1, x2, y2);
      double circumference = computeCircumference(radius);
      displayCircumference(circumference);
   }
   
   public static double caculateRadius(int set1x, int set1y, int set2x, int set2y){
      // plug the values into distance between = sqrt(square(x2-x1)+square(y2-y1))
      double radius = (Math.sqrt(Math.pow((set2x-set1x), 2) + Math.pow((set2y-set1y), 2)));
      
      // return this radius variable
      return radius;
      // save in distance double variable called radius
   }  
   
   public static double computeCircumference(double radiusPassed){
      int radius = (int)radiusPassed;
      System.out.println("The radius = " + radius);
      
      // circumference = 2*Math.PI*radius
      double calculate = (double)(Math.round(2*Math.PI*radiusPassed));
      
      // return the value caculated
      return calculate;
   }  
   
   public static void displayCircumference(double circumferencePassed){
      // make sure to turn into int
      int circumference = (int)circumferencePassed;
      System.out.println("The circumference =  " + circumference);
   }  
   
   public static void endLine(){
      System.out.println();
      System.out.println("-------------------------------------------------------");
      System.out.println();
   }
}