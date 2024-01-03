/* 
   10/6/23
   Lab 6: This java program will take a string and a int value 
   then pads the string with blank spaces that match the int input.
*/

//import java utils
import java.util.Scanner;

public class PadStringHelper {
   public static void main (String args []){
      padString();
   }  
   
   public static void padString(){
      Scanner console = new Scanner (System.in);
      String str1 = getInputString(console);
      int length1 = getInputLength(console);
      finalOutput(str1, length1);
      
   }
   
   public static String getInputString(Scanner console){
      System.out.print("Please enter a string ");
      String inputString = console.next();
      return inputString;
   }
   
   public static int getInputLength(Scanner console){
      System.out.print("Please enter the length of the result string ");
      int length = console.nextInt();
      return length;
   }
   
   public static void finalOutput(String word, int size){
      System.out.print("The resulting string is ");
      
      // Count the length of the string
      int lengthOfStr = word.length();
      int amountOfDashes = size - lengthOfStr;
      // minus the length of the string to the int value
      // store that as a value and add as many dash to the end of the string
      
      // for loop for dashes
      for (int i = 1; i <= amountOfDashes; i++){
         System.out.print("-");
      }
      System.out.print(word);

   }
} 