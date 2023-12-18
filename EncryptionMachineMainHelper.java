/* 
   10/26/23
   Assignment 3: This program replicates caesars cipher which is a kind of substitution cipher.
*/

import java.util.Scanner;

public class EncryptionMachineMainHelper {
   
   public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
   
   public static void main (String args []){
      runEncrypter();
   }  
   
   // the method that does a majority of the work and is called on by the main
   // this method is responsible for paying the key parameter, the number input, and the scanner to other methods
   public static void runEncrypter(){
      Scanner console = new Scanner (System.in);
      displayBanner();
      String key = getKey(console);
      encryptKey(key);
      int num = inputNumberOfWords(console);
      encryptWholeMessage(num, console);
   }
   
   // welcome message
   public static void displayBanner(){
      System.out.println("Welcome to the CSC 15 Encryption Machine");
      System.out.println("The program lets you encrypt a message");
      System.out.println("with a key for your recipient to decrypt!");
      System.out.println();
   }
   
   // ask for a key input then encrypt the key by shifting 3 up ex A TO D
   public static String getKey(Scanner console){
      System.out.println("Encrypted messages use a shared keyword to decrypt");
      // scanner required for user input
      System.out.print(" Enter key: ");
      
      return console.next();
   }
   
   // this encrypts the key in a similar fasion to how the words are encrypted and is passed the key parameter
   public static void encryptKey(String key){
      int shiftVar = 3; // set 3
      String keyEncrypted = "";
      
      for (int i = 0; i < key.length(); i++){
         // grab current letter working on which t
         char currentLetter = key.charAt(i); // this would return t
         // search inside of alphabet for index of t
         int indexOfLetter = ALPHABET.indexOf(currentLetter);
         // index of t plus shift var u want to use modulo as well to make sure if the input is over 26 it resets
         int shiftingInt = (indexOfLetter + shiftVar) % ALPHABET.length();
         // that will give us new index letter
         char shiftingLetter = ALPHABET.charAt(shiftingInt);
         // add to the encrypted one the shifting letter
         keyEncrypted += shiftingLetter;
      }
      System.out.println(" \"" + key + "\"" + " has been encrypted to: " + keyEncrypted);
      System.out.println();
   }
   
   
   // asks for number of words int to shift by aftering getting passed the scanner parameter
   public static int inputNumberOfWords(Scanner console){
      System.out.print("How many words is your message? ");
      return console.nextInt();
   }
   
   // gets passed the number and scanner, number required to send message
   public static void encryptWholeMessage(int num, Scanner console){
      for(int i = 1; i <= num; i++){
         String word = inputWord(console);
         encryptWord(word);
      }
      System.out.println();
      System.out.println("Message fully encrypted. Happy secret messaging!");
   }
   
   // asks for the the next word to encrypt using the scanner
   public static String inputWord(Scanner console){
      System.out.print(" Next word: ");
      return console.next();
   }
   
   // this method performs the word encrypting for the majority of the program and gets passed the word parameter
   public static void encryptWord(String word){
      String wordToEncrypt = word;
      int shiftVar = 3;
      String encrypted = "";
      // for loop
      for (int i = 0; i < wordToEncrypt.length(); i++){
         // grab current letter working on which t
         char currentLetter = wordToEncrypt.charAt(i); 
         // search inside of alphabet for index of t
         int indexOfLetter = ALPHABET.indexOf(currentLetter);
         // index of t plus shift var u want to use modulo as well to make sure if the input is over 26 it resets
         int shiftingInt = (indexOfLetter + shiftVar) % ALPHABET.length();
         // that will give us new index letter
         char shiftingLetter = ALPHABET.charAt(shiftingInt);
         // add to the encrypted one the shifting letter
         encrypted += shiftingLetter;
      }
      System.out.println("  \"" + wordToEncrypt + "\"" + " has been encrypted to: " +  encrypted );
   }
   
   

} 