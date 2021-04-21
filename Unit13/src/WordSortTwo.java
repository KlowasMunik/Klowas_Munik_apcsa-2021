//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public void selectionSortA()

	{

		for (int k = 0; k < wordRay.size(); k++)

		{

			String smallest = wordRay.get(k);       

			int smallestPosition = k;		

			for (int i = k+1; i < wordRay.size(); i++)

				{

					if (wordRay.get(i).compareTo(smallest) < 0)  

						{	

							smallestPosition = i; 

							smallest = wordRay.get(i);   		 

						   

							System.out.println(smallestPosition);        

						}		

			

				}		

			wordRay.set(smallestPosition, wordRay.get(k)); 

			wordRay.set(k, smallest);					

		}

	}

	public String toString()

	{

		String output="";

		

		for(String s : wordRay )

		{

			output+=             s+"\n";

		}

		return output+"\n\n";

	}	

}