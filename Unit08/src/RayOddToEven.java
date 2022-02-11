//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int index = 0;
		int firstOddIndex;
		
		while(ray[index] % 2 != 1) {
			index++;
			if(index == ray.length) {
				return -1;
			}
		}
		
		firstOddIndex = index;
		
		while(ray[index] % 2 != 0) {
			index++;
			if(index == ray.length) {
				return -1;
			}
		}
		
		return index - firstOddIndex;
	}
}