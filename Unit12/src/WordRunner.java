//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src/words.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		Word[] words = new Word[size];
		for(int line = 0; line < size; line++) {
			words[line] = new Word(file.nextLine());
		}
		
		Arrays.sort(words);
		for(int index = 0; index < size; index++) {
			System.out.println(words[index].toString());
		}
		
	}
}