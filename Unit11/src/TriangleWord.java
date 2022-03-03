//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		for(int row = 1; row <= word.length(); row++) {
			for(int numTimes = 0; numTimes < row; numTimes++) {
				System.out.print(word.substring(0, row));
			}
			System.out.println();
		}
	}
	
}