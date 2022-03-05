/**
 * Yogeshwor Shrestha
 * Professor Vohra
 * Data Structure and Algorithm
 * Assignment no. 4
 * Date: 10/11/2020
 */

package yshrestha1;

import java.util.Scanner;

public class Assignment5 
{
	public static void main(String[] args) 
	{
		String shareName;
		
		double sellShare;
		double netWorth = 0;
		double sharePrice = 0;
		double shareNumber = 0;
		StackInterface<String> stockStack = new OurStack<>();
		StackInterface<Double> priceStack = new OurStack<>();
		StackInterface<Double> numberStack = new OurStack<>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of stocks you want to buy : " );
		int number = input.nextInt();
		
		for(int i = 0; i < number; i++)
		{
			input.nextLine();
			System.out.println("Stock " +(i + 1) + ":");
			System.out.print("Enter the name : ");
			shareName  = input.nextLine();
			
			System.out.print("Number of shares to buy: ");
			shareNumber = input.nextDouble();
			
			System.out.print("Price of share: $");
			sharePrice = input.nextDouble();
			
			System.out.println("----------------------------");
			netWorth = netWorth + (shareNumber*sharePrice);
			stockStack.push(shareName);
			priceStack.push(sharePrice);
			numberStack.push(shareNumber);
		}
		
		String checker = "y";
		while( checker.equals("y"))
		{
			System.out.println("Change the most recent stock: ");
			System.out.println("Name of share " + "| Number of share(s) |" + "Price of share | " + "Total" );
			System.out.println(stockStack.peek() + "\t\t\t" +priceStack.peek() + "\t\t" + numberStack.peek() 
								+  "\t\t" + (priceStack.peek()*numberStack.peek()));

			System.out.println("Total networth of the protfolio: $" + netWorth);
			System.out.print("Enter the number of shares you want to sell: ");
			sellShare = input.nextDouble();
			input.nextLine();
			if(sellShare == numberStack.peek())
			{
				stockStack.pop();
				netWorth = netWorth - (priceStack.pop() * numberStack.pop());
			}
			else if(sellShare < numberStack.peek())
			{
				shareNumber = numberStack.peek() - sellShare;
				netWorth = netWorth - (numberStack.pop() * sellShare);
				numberStack.push(shareNumber);
			}
			else
			{
				System.out.println("Enter a valid number share amount to sell.");
			}
			
			System.out.println("Total networth of the protfolio: $" + netWorth);
			System.out.print("Press 'Y' or 'y' to continue on the stock: ");
			checker = input.nextLine();
			System.out.println("-------------------------------------------");
		}
		
		input.close();
	}
}
