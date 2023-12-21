/* 
   11/24/23
   Lab 12: Design a class called Circle that can be used to create a circle.
*/

class Circle {
   
   
   // template to make circle
   private int x; // x coord
   private int y; // y coord
   private int radius; 
   
   public Circle() { // default constructor - intializing all fields
      x = 0;
      y = 0;
      radius = 1;
   }
   
   public Circle(int x, int y, int radius) { // customized constructor - intializing all fields
      this.x = x;
      this.y = y;
      this.radius = radius;
   }
   
   // to display the radius
   public int getRadius(){
   
      return radius;
   }
   
   // to display x
   public int getX(){
   
      return x;
   }
   
   // to display y
   public int getY(){
   
      return y;
   }
   
   // use setters to change radius
   public void setRadius(int radius){
      this.radius = radius;
   
   }
   
   // use setters to change x
   public void setX(int x){
      this.x = x;
   
   }
   
   // use setters to change x
   public void setY(int y){
      this.y = y;
   }
   
   // get area
   public double getArea(){
      return Math.PI*Math.pow(radius, 2);
   }
   
   // get circumference
   public double getCircumference(){
   
      return 2*Math.PI*radius;
   }
   
   public String toString(){
      
      return "[(" + x + "," + y + "):" + radius + "]";

   }
}