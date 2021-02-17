//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		String a = new String("abcd");
	    String b = new String("abcd");

	    System.out.println(a == b);
	    System.out.println(a.hashCode() + " " + b.hashCode());
	    System.out.println(a.equals(b));

	    Map<String, String> map = new HashMap<>();

	    map.put(new String("abcd"), "abcd");
	    map.put(new String("abcd"), "wxyz");


	    System.out.println(map);
	}
}