//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word(String s)
	{
		word = s;
		
	}
	
	public int getLength()
	{
		return word.length();
		
	}
	
	public int compareTo(Word osu)
	{		
		
		return word.length()-osu.getLength();
	}

	public String toString()
	{
		return word;
		
	}
}