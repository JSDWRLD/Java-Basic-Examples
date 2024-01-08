/* 
   11/26/23
   Programming Assignment 5: This program is a game that is played with the user. The computer
   randomly selects a number between 1 and 100 and the user is trying to guess the number.
*/

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberHelper {

     // This method manages the game loop, including calling the method to play the game and handling the option to play again.
     public static void playGame() {
         Random rand = new Random();
         Scanner console = new Scanner(System.in);
         boolean playing = true;
         
         runGame(rand, console);
         
         do {
              System.out.println("Would you like to play again? Enter Y or N: ");
              String playAgain = console.next();
              
              switch (playAgain.toLowerCase()){
                 case "y":
                     runGame(rand, console);
                     break;
                 case "n":
                     playing = false;
                     break;
                 default:
                     System.out.println("Invalid input. Please enter Y or N.");
                     break;
               } 
           } while (playing);
           
     }
     
     // This method handles the core logic of the game, calls 1 method to generate a random number, and provides feedback.
     public static void runGame(Random rand, Scanner console) {
     
         int correctNum = rng(rand);
         int userGuess = 0;
         int count = 0;
         
         System.out.println("Enter a guess (1-100):");
         
         do {
            if (console.hasNextInt()){
               userGuess = console.nextInt();
               count++;
               if (userGuess < 1 || userGuess > 100){
                  System.out.println("Please enter a number between 1 and 100.");
               } else if (userGuess > correctNum){
                  System.out.println("Too high");
               } else if (userGuess < correctNum) {
                  System.out.println("Too low");
               } 
               
               
            } else {
                 console.next();
                 System.out.println("Invalid input, please enter a integer.");
            }
         } while(userGuess != correctNum);
         
         
         System.out.println("Congo");
         System.out.println("Number of Tries " + count);
         
     }  
     
     // This method rng stands for random number generator. 
     public static int rng(Random rand){
         return rand.nextInt(100) + 1; 
     }
     
}