//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{

	 public void add(Rational other) {

        

         int num = (this.numerator * other.denominator)

                                        + (this.denominator * other.numerator);

         int den = this.denominator * other.denominator;

   

         numerator = num;

         denominator = den;

         reduce();

}



private void reduce() {

        

         int gcd = gcd(numerator, denominator);

       

         numerator = numerator / gcd;

         denominator = denominator / gcd;



     
         if (denominator < 0) {

                        numerator *= -1;

                        denominator *= -1;

         }

}





private int gcd(int num1, int num2) {

         //using Euclidian formula to find the gcd recursively

         if (num2 == 0)

                        return num1; //base condition

         return gcd(num2, num1 % num2);



}



protected Object clone() {

         // creating and returning a copy of the Rational number

         return new Rational(numerator, denominator);

}



@Override

public boolean equals(Object other) {

         if (other instanceof Rational) {


                        Rational r = (Rational) other;

                        return this.numerator == r.numerator

                                                        && this.denominator == r.denominator;

         }

         return false; 

}



@Override

public String toString() {

         return numerator + "/" + denominator;

}

}






	
	
