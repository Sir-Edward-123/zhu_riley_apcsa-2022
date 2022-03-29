//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] luckySeven = new int[size];
		for(int index = 0; index < size; index++) {
			luckySeven[index] = (int)(Math.random() * 10) + 1;
		}
		return luckySeven;
		
	}
	
	public static void shiftEm(int[] array)
	{
		int replaceIndex = 0;
		for(int index = 0; index < array.length; index++) {
			if(array[index] == 7) {
				array[index] = array[replaceIndex];
				array[replaceIndex] = 7;
				replaceIndex++;
			}
		}
	}
	
}