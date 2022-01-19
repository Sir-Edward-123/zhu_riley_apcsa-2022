//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		Distance test;
		int x1;
		int y1;
		int x2;
		int y2;
		
		//add test cases
		// Test 1
		out.print("Enter X1 :: ");
		x1 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		y1 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		x2 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		y2 = keyboard.nextInt();
		test = new Distance(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
		
		// Test 2
		out.print("Enter X1 :: ");
		x1 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		y1 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		x2 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		y2 = keyboard.nextInt();
		test = new Distance(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
		
		// Test 3
		out.print("Enter X1 :: ");
		x1 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		y1 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		x2 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		y2 = keyboard.nextInt();
		test = new Distance(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
		
	}
}