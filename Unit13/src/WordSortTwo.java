//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
		sort();
	}

	public void sort()
	{
		for(int startIndex = 0; startIndex < wordRay.length; startIndex++) {
			int leastWordIndex = startIndex;
			for(int compareIndex = startIndex + 1; compareIndex < wordRay.length; compareIndex++) {
				if(wordRay[compareIndex].compareTo(wordRay[leastWordIndex]) < 0) {
					leastWordIndex = compareIndex;
				}
			}
			
			String leastWord = wordRay[leastWordIndex];
			wordRay[leastWordIndex] = wordRay[startIndex];
			wordRay[startIndex] = leastWord;
		}
	}

	public String toString()
	{
		String output="";
		for(int index = 0; index < wordRay.length; index++) {
			output += wordRay[index] + "\n";
		}
		return output+"\n\n";
	}
}