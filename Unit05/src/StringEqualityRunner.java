//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		System.out.println(new StringEquality("hello", "goodbye"));
		System.out.println(new StringEquality("one", "two"));
		System.out.println(new StringEquality("three", "four"));
		System.out.println(new StringEquality("TCEA", "UIL"));
		System.out.println(new StringEquality("State", "Champions"));
		System.out.println(new StringEquality("ABC", "ABC"));
		System.out.println(new StringEquality("ABC", "CBA"));
		System.out.println(new StringEquality("Same", "Same"));
	}
}