//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int count(int num)
	{
		if(num > 0)
		{
			if((num%10) % 2 == 1)
				return 1+ count(num/10);
			return count(num/10);
		}

		return 0;
	}
}