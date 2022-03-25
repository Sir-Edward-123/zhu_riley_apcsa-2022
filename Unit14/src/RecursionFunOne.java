//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu
//Date - March 24, 2022
//Class - AP Computer Science A
//Lab  - Unit 13

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		if(num == 0) {
			return 0;
		}
		
		if(num % 2 == 0) {
			return 1 + countOddDigits(num / 10);
		} else {
			return countOddDigits(num / 10);
		}
	}
}