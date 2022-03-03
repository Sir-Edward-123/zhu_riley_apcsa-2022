//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		String continueInput;
		do {
		System.out.print("Enter a word :: ");
		TriangleWord.printTriangle(keyboard.next());
		System.out.println();
		System.out.print("Do you want to enter more sample input? ");
		continueInput = keyboard.next();
		System.out.println();
		} while(continueInput.equals("y") || continueInput.equals("Y"));
		
		keyboard.close();
	}
}