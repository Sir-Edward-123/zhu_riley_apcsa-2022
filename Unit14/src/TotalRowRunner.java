//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu
//Date - March 24, 2022
//Class - AP Computer Science A
//Lab  - Unit 13

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		//add code here
		int[][] arr = {{1,2,3}, {5,5,5,5}};
		System.out.println(TotalRow.getRowTotals(arr));
		
		arr = new int[][]{{1,2,3}, {5}, {1}, {2,2}};
		System.out.println(TotalRow.getRowTotals(arr));
		
		arr = new int[][]{{1,2}, {5,5}, {5,5}, {4,5,6,7}, {123124,12312}};
		System.out.println(TotalRow.getRowTotals(arr));
	}
}



