//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));
		
		int size = file.nextInt();
		file.nextLine();
		
		Word happy[] = new Word[size];
		
		for(int j = 0; j < size; j++)
		{
			Word t = new Word(file.next());
			happy[j] = t;
		}
		
		for(int j= 0; j < size; j++)
		{
			for(int t = 0; t < size - 1; t++)
			{
				if(happy[t].compareTo(happy[t + 1]) > 0)
				{
					Word r=happy[t + 1];
					happy[t + 1]=happy[t];
					happy[t]=r;
				}
				else if(happy[t].getLength()==happy[t + 1].getLength()&&happy[t].toString().compareTo(happy[t + 1].toString()) > 0)
				{
					Word r = happy[t + 1];
					happy[t + 1] = happy[t];
					happy[t] = r;
				}
			}
		}
		
		for(int j = 0; j < size; j++)
		{
			System.out.println(happy[j]);
		}

	}
}