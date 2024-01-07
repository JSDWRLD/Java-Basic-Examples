/* 
   10/13/23
   LAB 7: This program checks to see if a date that is entered is a valid date.
   If the year is a leap year feb should have 29 days and it will be valid.
   If the year is not a leap year and you enter 29 it will be a invalid date.
*/

import java.util.Scanner;

public class DatesHelperNew {
   public static void main (String args []){
      checkDate();
   }  
   
   // this method calls 4 other methods to check if each variable is valid then prints out accordingly
   public static void checkDate(){
      Scanner console = new Scanner (System.in);
      int month, day, year;
      System.out.println("Enter month, day, year");
      month = console.nextInt();
      day = console.nextInt();
      year = console.nextInt();
      
      boolean monthValid = checkMonth(month);
      boolean yearValid = checkYear(year);
      boolean isLeapYear = checkLeapYear(year);
      boolean dayValid = checkDate(month, day, isLeapYear);
      
      // the main system to check if the date is valid
      if (dayValid && monthValid && yearValid) {
         System.out.println("Date is valid.");
         if (isLeapYear) {
            System.out.println("Year is a leap year.");
         } else {
            System.out.println("Year is not a leap year.");
         }   
      } else {
         System.out.println("Date is invalid.");
      }
   }
   
   // method checks month and returns boolean
   public static boolean checkMonth(int month) {
      if (month >= 1 && month <= 12) {
         return true;
      }
      
      return false; 
   }
   
   // method checks year and returns boolean
   public static boolean checkYear(int year) {
      if (year >= 1000 && year <= 2100) {
         return true;
      }
      
      return false; 
   }
   
   // method checks if leap year and returns boolean
   public static boolean checkLeapYear(int year) {
      if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
         return true;
      }

      return false; 
   }
   
   // this method checks the date and make sure it is in allignment with the current month
   public static boolean checkDate(int month, int day, boolean isLeapYear){
      int daysOfMonth = 0;
      // determine days of month and changes the constant variable
      switch (month) {
      case 1, 3, 5, 7, 8, 10, 12:
        daysOfMonth = 31;
        break;
      case 4, 6, 9, 11:
        daysOfMonth = 30;
        break;
      case 2:
        if (isLeapYear) {
            daysOfMonth = 29;
        } else {
            daysOfMonth = 28;
        }
        break;
      default:
        // in case error
        break;
      }

      
      if (day <= daysOfMonth) {
         return true;
      }
      return false;
   }
} 