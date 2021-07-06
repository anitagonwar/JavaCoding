//5. Write a program to read monetary amount in cents and print the smallest possible number of coins equaling the amount. 
//Example: monetary amount in cents=288 2 Dollar 3 quarter 1 dime 3 pennies So smallest possible number of coins equaling the amount 283====9 coins

package MonetaryAmount;

import java.util.Scanner;

public class SmallestPossibleCoins {
	public static void main(String [] args) {
	    Scanner in = new Scanner(System.in);
	    int cents; //input variables
	    int dollars, quarters, dimes, nickels, pennies; //output
	    System.out.print("Enter an amount in cents:");
	
	    cents = in.nextInt();
	    System.out.print("Amount in cents:" +cents);
	    
	    dollars = cents/100;
	    cents = cents%100;
	    
	    quarters = cents/25;
	    cents = cents%25;
	    
	    dimes = cents/10;
	    cents = cents%10;
	    
	    nickels = cents/5;
	    cents = cents%5;
	    
	    pennies = cents/1;
	    cents = cents%1;
	
	    System.out.println("("+dollars+" Dollars, " +quarters +" Quarters, "+dimes+" Dimes, "+nickels+" Nickels, "+pennies+" Pennies )");
	    
	    in.close();
	}
}