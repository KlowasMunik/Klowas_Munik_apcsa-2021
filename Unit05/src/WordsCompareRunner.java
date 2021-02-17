//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   String str_Sample = "a";
       System.out.println("Compare To 'a' b is : " + str_Sample.compareTo("b"));
       str_Sample = "b";
       System.out.println("Compare To 'b' a is : " + str_Sample.compareTo("a"));
       str_Sample = "b";
       System.out.println("Compare To 'b' b is : " + str_Sample.compareTo("b"));
	}
}