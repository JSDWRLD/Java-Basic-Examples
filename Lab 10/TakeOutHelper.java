/* 
   11/10/23
   LAB 10: This program displays the menu of food choices with the price and allows the
   user to select items.
*/
import java.util.Scanner;

// this helper file is to be used in conjunction with the TakeOut.java as there is no main method in the helper.
public class TakeOutHelper {

     // global variables
     public static double runningTotal = 0;
     public static boolean ordering = true;

     // this method takes in user input and does an action depending on their menu choices.
     public static void takeOutMenu(){
        Scanner console = new Scanner(System.in);
        int menuOption;
        double quantity;
        
        printMenu();
   
        do {
           menuOption = console.nextInt();
           
           switch (menuOption){
              case 1, 2, 3:
                  double price = itemPrice(menuOption);
                  quantity = getQuantity(console);
                  double subtotal = subTotal(quantity, price);
                  runningTotal = runningTotal + subtotal;
                  printMenu();
                  break;
              case 4:
                  ordering = done(runningTotal);
                  break;
              default:
                  break;
            } 
        } while (ordering);
        
        
        
     }
     
     // method will print the menu to the user.
     public static void printMenu() {
        System.out.println("Welcome");
        System.out.println("1. Burger ($2.00)");
        System.out.println("2. Fries ($1.50)");
        System.out.println("3. Soda ($1.00)");
        System.out.println("4. Done");
     }
     
     // this method will print the item what you have ordered and return the price
     public static double itemPrice(int foodItem) {
        double price = 0;
   
        switch (foodItem) {
            case 1:
               System.out.println("You've ordered a burger");
               price = 2.00;
               break;
            case 2:
               System.out.println("You've ordered fries");
               price = 1.50;
               break;
            case 3:
               System.out.println("You've ordered a soda");
               price = 1.00;
               break;
           }
   
        return price;
     }
     
     // this method will get the quantity through user input
     public static double getQuantity(Scanner console) {
           System.out.println("Enter quantity");
           double quantity=console.nextDouble();
           
           return quantity;
     }
     
     // this method will multiply the quantity and item price and return a subtotal 
     public static double subTotal(double quantity, double itemPrice) {
           double subTotal=quantity*itemPrice;
           System.out.println("Subtotal: " + subTotal);
           
           return subTotal;
     }
     
     // this method is the final method that will print total and return a false boolean to exit the loop
     public static boolean done(double runningTotal) {
         boolean flag = false;
         System.out.println("Enjoy your meal");
         System.out.println("Total amount: " + runningTotal);
         return flag;
     }
   
}
