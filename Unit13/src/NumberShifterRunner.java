//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		for(int i = 0; i < 5; i++) {
			int[] arr = NumberShifter.makeLucky7Array(20);
			System.out.println(Arrays.toString(arr));
			NumberShifter.shiftEm(arr);
			System.out.println(Arrays.toString(arr));
			System.out.println();
		}
	}
}



