//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		if(str.length() < 2) {
			return 0;
		}
		
		int count = 0;
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i - 1) ==  str.charAt(i)) {
				count++;
			}
		}
		return count;
	}
	
}