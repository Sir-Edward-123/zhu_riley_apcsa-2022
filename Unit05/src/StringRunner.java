//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		System.out.print("Enter a word :: ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(new StringOddOrEven(s));
	}
}