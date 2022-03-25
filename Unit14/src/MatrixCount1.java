//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu
//Date - March 24, 2022
//Class - AP Computer Science A
//Lab  - Unit 13

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    							{ 6, 7, 8, 9, 0},
    							{ 6, 7, 1, 2, 5},
    							{ 6, 7, 8, 9, 0},
    							{ 5, 4, 3, 2, 1}};

    public static int count( int val  )
    {
    	int count = 0;
		for(int row = 0; row < m.length; row++) {
			for(int col = 0; col < m[row].length; col++) {
				if(m[row][col] == val) {
					count++;
				}
			}
		}
		return count;
    }
}
