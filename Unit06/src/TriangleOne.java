//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word = "";
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print()
	{
		for(int triangleSize = word.length(); triangleSize >= 1; triangleSize--) {
			System.out.println(word.substring(0, triangleSize));
		}
		System.out.println("\n");
	}
	
}