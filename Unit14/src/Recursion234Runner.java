//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu
//Date - March 24, 2022
//Class - AP Computer Science A
//Lab  - Unit 13

import static java.lang.System.*;

public class Recursion234Runner
{
	public static void main(String args[])
	{
		System.out.println("----- Recursion Fun One -----");
		System.out.println(RecursionFunOne.countOddDigits(4532));
		System.out.println(RecursionFunOne.countOddDigits(11145322));
		System.out.println(RecursionFunOne.countOddDigits(224532714));
		System.out.println(RecursionFunOne.countOddDigits(2468));
		System.out.println(RecursionFunOne.countOddDigits(13579));
		System.out.println();

		//add more test cases
		System.out.println("----- Recursion Fun Three -----");
		System.out.println(RecursionFunThree.luckyThrees(3));
		System.out.println(RecursionFunThree.luckyThrees(31332));
		System.out.println(RecursionFunThree.luckyThrees(134523));
		System.out.println(RecursionFunThree.luckyThrees(3113));
		System.out.println(RecursionFunThree.luckyThrees(13331));
		System.out.println(RecursionFunThree.luckyThrees(777337777));
	}
}