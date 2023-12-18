/* 
   12/7/23
   Programming Assignment 7: This program is a trivia game that is played with the user. 
   The game will also give out points depending on if answers are correct or incorrect.
*/

import java.util.Scanner;

public class TriviaGameHelper {
     
     // Global constant for the size of the trivia game
     public static final int SIZE = 5;
     
     // Initializes arrays with trivia questions, answers, and corresponding points, then starts the game.
     public static void run(){
     
         // creates scanner object
         Scanner console = new Scanner(System.in);
         
         // intialize arrays set to global size variable
         String[] questions = new String[SIZE];
         String[] answers = new String[SIZE];
         int[] points = new int[SIZE];
         
         // calls intialize method to set the questions, the correct answers, and the points to each question
         intialize(questions, answers, points);
         
         // boolean to exit while loop if false
         boolean morePlayers = true;
         
         // do while loop set to call play method and check if there is another person who wants to play
         do {
            int score = play(questions, answers, points, console);
            System.out.println("Your score is : " + score);
            
            System.out.println("Is there another player? ");
            String response = console.nextLine();
            
            switch (response.toLowerCase()) {
               case "y", "yes":
                  morePlayers = true;
                  break;
               case "n", "no":
                  morePlayers = false;
                  break;   
               default:
                  morePlayers = false;
                  break;
            
            }
         
         } while (morePlayers);
         
     }
     
     // Manually assigns trivia questions, answers, and points to their respective arrays.
     public static void intialize (String[] questions, String[] answers, int[] points) {
     
     questions[0] = "Which Disney Princess talks to the most animals? ";
     answers[0] = "snow white";
     points[0] = 1;
     
     questions[1] = "What sport is dubbed the \"king of sports\"? ";
     answers[1] = "soccer";
     points[1] = 2;
     
     questions[2] = "What's the fastest land animal? ";
     answers[2] = "cheetah";
     points[2] = 1;
     
     questions[3] = "In little red riding hood, who does the wolf dress up as? ";
     answers[3] = "grandmother";
     points[3] = 3;
     
     questions[4] = "Who was the first U S president? ";
     answers[4] = "george washington";
     points[4] = 1;
     
     }
     
     // Runs the trivia game, asking questions, getting user input, and returning a score based on correctness.
     public static int play(String[] questions, String[] answers, int[] points, Scanner console){
         
         // intialize the score to tally up if the answer is correct
         int score = 0;
         
         // for loop to traverse the question array, point array, and answer array according to the current index
         for (int i = 0; i < SIZE; i++){
            System.out.println();
            System.out.println("Question " + (i+1) );
            System.out.print(questions[i]);
            String userGuess = console.nextLine();
            
            // this is to keep track of the users guess and adds a point if they are correct
            if ( answers[i].equals(userGuess.toLowerCase()) ){
               System.out.println("That is correct!");
               score += points[i];
            } else {
               System.out.println("Wrong. The correct answer is " + answers[i]);
            }
            
            

         }
         
         return score;
     }
     
     public static void main(String[] args) {
         run();
     }
}