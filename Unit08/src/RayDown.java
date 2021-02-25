//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		void checkType(int arr[], int n) 
		{ 

		    if (arr[0] <= arr[1] && arr[n - 2] <= arr[n - 1]) 
		        cout << "Increasing"; 
		  return true;
		    else if (arr[0] >= arr[1] && arr[n - 2] >= arr[n - 1]) 
		        cout << "Decreasing"; 
		  return false;
		    
		    else if (arr[0] <= arr[1] && arr[n - 2] >= arr[n - 1]) 
		        cout << "Increasing then decreasing"; 
		  return true;
		    else
		        cout << "Decreasing then increasing"; 
		    return false;
		} 
		return true;
	}	
}