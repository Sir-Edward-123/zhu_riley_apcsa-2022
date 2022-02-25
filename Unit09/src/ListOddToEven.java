//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int firstOddIndex = -1;
		for(int index = 0; index < ray.size(); index++) {
			if(index == ray.size() - 1) {
				return -1;
			}
			
			if(ray.get(index) % 2 == 1) {
				firstOddIndex = index;
				break;
			}
		}
		
		int lastEvenIndex = -1;
		for(int index = firstOddIndex; index < ray.size(); index++) {
			if(ray.get(index) % 2 == 0) {
				lastEvenIndex = index;
			}
		}
		
		if(lastEvenIndex == -1) {
			return -1;
		} else {
			return lastEvenIndex - firstOddIndex;
		}
	}
}