//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu
//Date - February 10, 2022

public class RaySumLast
{
	public static int go(int[] ray)
	{
		if(ray.length == 0) {
			return -1;
		}
		
		int sum = 0;
		int checkNum = ray[ray.length - 1];
		
		for(int index = 0; index < ray.length - 1; index++) {
			if(ray[index] > checkNum) {
				sum += ray[index];
			}
		}
		
		if(sum == 0) {
			return -1;
		} else {
			return sum;
		}
	}
}