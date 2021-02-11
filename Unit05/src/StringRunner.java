//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("enter a word :: ");
		String wordd = keyboard.nextLine();
		
		StringOddOrEven test = new StringOddOrEven();
		System.out.println(wordd + " is " + test);
	}
}