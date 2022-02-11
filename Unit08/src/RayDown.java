//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu
//Date - February 10, 2022

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		for(int index = 1; index < numArray.length; index++) {
			if(numArray[index - 1] <= numArray[index]) {
				return false;
			}
		}
		return true;
	}	
}