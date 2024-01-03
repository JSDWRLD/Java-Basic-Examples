/* 
   11/9/23
   Programming Assignment 4: This program asks for the users monthly income and either
   daily or monthly expenses and lets them know if they are a big spender or big saver.
*/


import java.util.Scanner;

public class BudgeterHelper{

   // this method calls 8 methods and is the main method that passes the parameters down
   public static void calculateBudget(){
     Scanner kb = new Scanner(System.in);
     displayOpeningMessage();
     double income = getTotalIncome(kb);
     int month = promptWhichMonth(kb);
     int days = daysInMonth(month);
     
     double expenses = getTotalExpenses(kb, days);
     displayTotalIncomeAndExpenses(income, expenses, days);
     double netIncome = calculateNetIncome(income, expenses);

     displayOutput(netIncome);
   }

   // this method simply displays the opening message
   public static void displayOpeningMessage(){
      System.out.println("This program asks for your monthly income and expenses, then tells you your net monthly income\n");
   }
   
   // this method simply prompts the income message
   public static void promptCategoryIncome(){
      System.out.print("How many categories of income? ");
   }
   
   // this method simply prompts the how many expense message
   public static void promptCategoryExpense(){
      System.out.print("How many categories of expense? ");
   }
   
   // this method simply prompts the for the next user input of income
   public static void promptNextIncomeAmount(){
      System.out.print("Next Income Amount? ");
   }
   
   // this method simply prompts the for the next user input of expenses
   public static void promptNextExpenseAmount(){
      System.out.print("Next Expense Amount? ");
   }
   
   // this method simply prompts the user for the month number they're referring to and returns that int
   public static int promptWhichMonth(Scanner kb){
      System.out.print("What is the month number? ");
      return kb.nextInt();
   }
   
   // this method asks the user if they are using monthly or daily expenses
   public static void promptMonthlyDaily(){
      System.out.print("Enter 1 for monthly or 2 for daily expenses ");
   }
   
   // this method displays the final output with correct formatting and also calls one method 
   public static void displayOutput(double netIncome){
     
     if (netIncome <= 0){
       System.out.printf("%s%4.2f%s","You spent ", Math.abs(netIncome), " more than you earned this month\n");
     } else {
       System.out.printf("%s%4.2f%s","You earned ", Math.abs(netIncome), " more than you spent this month\n");
     } 
     System.out.println("You're a " + checkTypeSaverSpender(netIncome));
   }
   
   // this method returns a int value based on the switches for the correct days of month
   public static int daysInMonth(int month){
     switch (month){
   
       case 1:
       case 3:
       case 5:
       case 7: 
       case 8: 
       case 10:
       case 12:
               return 31;
       case 4:
       case 6:
       case 11: 
             return 30;
       default: return 28;
     }
   
   }
   
   // this method subtracts income from expenses and returns it
   public static double calculateNetIncome(double income, double expenses){
     return income-expenses;
   }
   
   // this method checks if their income is above or below a certain threshold and returns a string
   public static String checkTypeSaverSpender(double netIncome){
      if (netIncome >= 250){
         return "big saver";
      } else if (netIncome >= 0 && netIncome < 250) {
         return "saver";
      } else if (netIncome >= -250 && netIncome < 0) {
         return "spender";
      } else {
         return "big spender";
      }

   }
   
   // this method calls one method to prompt for amount of income sources, then to continue asking for the income, and returns the total income
   public static double getTotalIncome(Scanner kb){
      int numCategories=0;
      double income=0;
      promptCategoryIncome();
      numCategories = kb.nextInt();
      for (int i = 1; i <= numCategories; i++) {
         promptNextIncomeAmount();
         income += kb.nextDouble();
     }
    
      return income;
   }
   
   // this method calls one method to prompt for amount of expense sources, then to continue asking for the expense amount, and returns the expenses
   public static double getTotalExpenses(Scanner kb, int days){
      promptMonthlyDaily();
      int monthlyDaily = kb.nextInt();
      
      double expenses=0;
      promptCategoryExpense();
      int numOfCategories = kb.nextInt();
     
      
      for (int i = 0; i < numOfCategories; i++){
         promptNextExpenseAmount();
         expenses += kb.nextDouble();
     }
     
     if (monthlyDaily == 2) {
         return expenses*days;
      }
     
     return expenses;
   }
   
   // this method displays the total amount of income/expenses with the correct formating
   public static void displayTotalIncomeAndExpenses(double totalIncome, double totalExpenses, int daysInMonth){
     System.out.printf("%s%4.2f", "Total income = ", totalIncome);
     System.out.printf("%s%4.2f%s%n", "(", totalIncome/daysInMonth , " per day)");
     System.out.printf("%s%4.2f", "Total expenses = ", totalExpenses);
     System.out.printf("%s%4.2f%s%n", "(", totalExpenses/daysInMonth , " per day)");
   }
}
