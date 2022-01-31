//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

   //add constructors
   public Perfect() {
	   number = 0;
   }
   
   public Perfect(int num) {
	   setNumber(num);
   }

   //add a set method
   public void setNumber(int num) {
	   number = num;
   }

   public boolean isPerfect()
   {
	   int sumOfDivisors = 0;
	   for(int possibleDivisor = 1; possibleDivisor <= number / 2; possibleDivisor++) {
		   if(number % possibleDivisor == 0) {
			   sumOfDivisors += possibleDivisor;
		   }
	   }

	   if(sumOfDivisors == number) {
		   return true;
	   } else {
		   return false;
	   }
   }

   //add a toString
   public String toString() {
	   if(isPerfect()) {
		   return number + " is perfect.";
	   } else {
		   return number + " is not perfect.";
	   }
   }
	
}