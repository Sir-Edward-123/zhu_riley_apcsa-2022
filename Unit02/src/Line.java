//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu
//Date - January 18, 2022
//Class - AP Computer Science A
//Lab  - Slope Lab

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double slope = (double) (y2- y1) / (x2 - x1);
		return slope;
	}

}