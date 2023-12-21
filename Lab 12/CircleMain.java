/* 
   11/24/23
   Lab 12: Design a class called Circle that can be used to create a circle.
*/

public class CircleMain {
  
  public static void main(String[] args) {
      Circle circleOne = new Circle();
      Circle circleTwo = new Circle(-5, -6, 9);
      
      // x coordinates of both circles
      int circleOneX = circleOne.getX();
      int circleTwoX = circleTwo.getX();
      
      // ycoordinates of both circles
      int circleOneY = circleOne.getY();
      int circleTwoY = circleTwo.getY();
      
      // radius of both circles
      int circleOneRadius = circleOne.getRadius();
      int circleTwoRadius = circleTwo.getRadius();
      
      // display the getters
      System.out.println("Circle One (x, y, radius) : " + circleOneX + ", " + circleOneY + ", " + circleOneRadius);
      System.out.println("Circle Two (x, y, radius) : " + circleTwoX + ", " + circleTwoY + ", " + circleTwoRadius);
      
      // getArea for both circles
      double cOneArea = circleOne.getArea();
      double cTwoArea = circleTwo.getArea();
      
      // display areas
      System.out.println("Area Circle One: " + cOneArea);
      System.out.println("Area Circle Two: " + cTwoArea);
      
      // getCircumference for both circle
      double cOneCircu = circleOne.getCircumference();
      double cTwoCircu = circleTwo.getCircumference();
      
      // display circumference
      System.out.println("Circumference Circle One: " + cOneCircu);
      System.out.println("Circumference Circle Two: " + cTwoCircu);
      
      // change center of circleOne
      circleOne.setX(4);
      circleOne.setY(5);
      
      // change radius of circleTwo
      circleTwo.setRadius(11);
      
      // display both circles using too string
      System.out.println(circleOne.toString());
      System.out.println(circleTwo.toString());

  }
}