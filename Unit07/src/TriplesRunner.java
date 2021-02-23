//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   int max = number;
       for (int i = 0; i<=number; i++) {
           for(a = 1; a <= max; a++) {
               a = i;
               for(b = a +1; b <= max; b++) {
                   b =i;
                   for(c = b + 1; c <= max; c++) {
                       c = i;
                       if(a*a+b*b==c*c) {
                           if((a%2==1 && b%2==0)|| (a%2==0 && b%2==1)) {
                               if(a%2<=1 && b%2<=1 && c%2<=1) {
                                   return 1;
                               }
                           }
                       }
                   }
               }
           }
       }
	}
}