//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		int x = 2100;
		double y = .15;
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		
		out.print("bill amount after the discount :: " + x * y);
	}
}