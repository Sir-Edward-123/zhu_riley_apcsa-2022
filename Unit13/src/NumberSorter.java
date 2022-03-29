//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		int divisor = 1;
		while(number / divisor > 0) {
			count++;
			divisor *= 10;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		for(int digitIndex = 0; digitIndex < sorted.length; digitIndex++) {
			sorted[digitIndex] = number % 10;
			number /= 10;
		}
		for(int startIndex = 0; startIndex < sorted.length; startIndex++) {
			int leastNumIndex = startIndex;
			for(int compareIndex = startIndex + 1; compareIndex < sorted.length; compareIndex++) {
				if(sorted[compareIndex] < sorted[leastNumIndex]) {
					leastNumIndex = compareIndex;
				}
			}
			int leastNum = sorted[leastNumIndex];
			sorted[leastNumIndex] = sorted[startIndex];
			sorted[startIndex] = leastNum;
		}
		return sorted;
	}
}