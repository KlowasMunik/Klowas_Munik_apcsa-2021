//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearchRunner
{
	public static void main(String[] args) throws FileNotFoundException
	{
	
		Scanner ws = new Scanner(new File("hidden.txt"));
		

		int m = ws.nextInt();
		

		int n = ws.nextInt();
		
		
		WordSearch wordSearch = new WordSearch(m, n);
		
		
		for(int r = 0; r < m; r++) 
		{
			for(int c = 0; c < n; c++) 
			{
				String s = ""; 
				s = s + ws.next();
				wordSearch.setSpot(s, r, c);
			}
			ws.nextLine();	
		}
	
		int k = ws.nextInt();

		
		while(ws.hasNext())
		{	
			String s = ws.next(); 
			System.out.println(s + " " + wordSearch.inGrid(s));
			
	}
}