//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int sum = 0;
		for(int index = 1; index < ray.size(); index++) {
			if(ray.get(index) > ray.get(0)) {
				sum += ray.get(index);
			}
		}
		
		if(sum == 0) {
			return -1;
		} else {
			return sum;
		}
	}
}