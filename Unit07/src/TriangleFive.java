//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output = "";
		int offset;
		
		for(int line = 0; line < amount; line++) {
			offset = letter - 65;
			for(int numLetters = amount; numLetters > line; numLetters--) {
				char addLetter = (char) (offset % 26 + 'A');
				for(int letterCounter = 0; letterCounter < numLetters; letterCounter++) {
					output += addLetter;
				}
				output += " ";
				offset++;
			}
			output += "\n";
		}
		
		return output;
	}
}