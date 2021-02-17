//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		String str;  
		System.out.println("Enter a string: ");  
		System scanner = new Scanner(System.in);  
		str = scanner.nextLine();  
		scanner.close();                                //closes the input stream  
		String reversed = reverseString(str);  
		System.out.println("The reversed string is: " + reversed);
	}

	public Word(String s)
	{
		if (s.isEmpty())
			return s;  
			return reverseString(s.substring(1)) + s.charAt(0);
	}

	public void setString(String s)
	{
		char ch1 = str.charAt(0);
	}

	public char getFirstChar()
	{
		char ch1 = str.charAt(0);
		return ch1;
	}

	public char getLastChar()
	{
		char ch2 = str.charAt(char.length));
		return ch2;
	}

	public String getBackWards()
	{
		String back="";
		return back;
	}

 	public String toString()
 	{
 		return "";
	}
}