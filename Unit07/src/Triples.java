//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Riley Zhu

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for(int i = 1; i < c/2; i++) {
			if(a % i == 0 && b % 1 == 0 && c % i == 0) {
				max = i;
			}
		}

		return max;
	}

	public String toString()
	{
		String output="";
		for(int c = 1; c < number; c += 2) {
			for(int b = 1; b < c; b++) {
				for(int a = 1; a < b; a++) {
					if((a % 2 == b % 2) || greatestCommonFactor(a, b, c) > 1) {
						continue;
					} else {
						if(a*a + b*b == c*c) {
							output += a + " " + b + " " + c + "\n";
						}
					}
					
				}
			}
		}

		return output + "\n";
	}
}