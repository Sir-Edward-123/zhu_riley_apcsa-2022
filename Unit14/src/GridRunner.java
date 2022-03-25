//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu
//Date - March 24, 2022
//Class - AP Computer Science A
//Lab  - Unit 13

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid grid = new Grid(10, 10, new String[]{"a", "b", "c", "d", "e"});
		System.out.println(grid);
		System.out.println();
		
		grid = new Grid(5, 5, new String[] {"1", "x", "."});
		System.out.println(grid);
		System.out.println();
		
		grid = new Grid(20, 20, new String[] {"@", ","});
		System.out.println(grid);
		System.out.println();
	}
}