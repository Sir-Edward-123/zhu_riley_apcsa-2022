import java.util.List;
import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu
//Date - February 24, 2022

public class DownRunner
{
	public static void main( String args[] )
	{
		List<Integer> list = new ArrayList<Integer>();
		int[][] data = new int[][]
				{
					new int[] {-99,1,2,3,4,5,6,7,8,9,10,12345},
					new int[] {10,9,8,7,6,5,4,3,2,1,-99},
					new int[] {10,20,30,40,50,-11818,40,30,20,10},
					new int[] {32767},
					new int[] {255,255},
					new int[] {9,10,-88,100,-555,1000},
					new int[] {10,10,10,11,456},
					new int[] {-111,1,2,3,9,11,20,30},
					new int[] {9,8,7,6,5,4,3,2,0,-2,-989},
					new int[] {12,15,18,21,23,1000},
					new int[] {250,19,17,15,13,11,10,9,6,3,2,1,-455},
					new int[] {9,10,-8,10000,-5000,1000}
				};
				
		for(int i = 0; i < data.length; i++) {
			addElements(data[i], list);
			System.out.println(ListDown.go(list));
			list.clear();
		}
	}
	
	public static void addElements(int[] arr, List<Integer> list) {
		for(int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
	}
	
}