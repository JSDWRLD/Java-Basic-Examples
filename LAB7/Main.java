import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
   public static void main (String args []){
      vowelCount("hi");
      mystery(64);
   }  
   
   public static void run(){
      Scanner console = new Scanner(System.in); 
      System.out.print("Desired dice sum: ");
      int desiredSum = console.nextInt();
      Random rand = new Random();
      
      int sum = rollDices(desiredSum, rand);
      
      while (sum != desiredSum){
         sum = rollDices(desiredSum, rand);
      }
   }
   
   public static int rollDices(int target, Random rand){
      int diceOne = rand.nextInt(6) + 1;
      int diceTwo = rand.nextInt(6) + 1;
      int total = diceOne + diceTwo;
      
      System.out.println(diceOne + " and " + diceTwo + " = " + total);
      
      return total;
   }
   
   public static int[] vowelCount(String sentence){
      int [] array = new int[5];
      
      for(int i = 0; i < sentence.length(); i++){
         char currentChar = sentence.charAt(i);
         switch(currentChar){
            case 'a':
               array[0] += 1;
               break;
            case 'e':
               array[1] += 1;
               break;
            case 'i':
               array[2] += 1;
               break;
            case 'o':
               array[3] += 1;
               break;
            case 'u':
               array[4] += 1;
               break;
            default:
               break;
         }
      }
      
      return array;
   }
   
   public static void mystery(int x) {
      int y = 0;
      while (x % 2 == 0) {
      y++;
      x = x / 2;
      System.out.println(x);
      }
      System.out.println(x + " " + y);
   }
} 