//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu
//Date - March 24, 2022
//Class - AP Computer Science A
//Lab  - Unit 13

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	ArrayList<Integer> totals = new ArrayList<Integer>();
    	for(int row = 0; row < m.length; row++) {
    		int rowTotal = 0;
    		for(int col = 0; col < m[row].length; col++) {
    			rowTotal += m[row][col];
    		}
    		totals.add(rowTotal);
    	}
		return totals;
    }
}
