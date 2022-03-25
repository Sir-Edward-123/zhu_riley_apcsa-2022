//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu
//Date - March 24, 2022
//Class - AP Computer Science A
//Lab  - Unit 13

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int row = 0; row < rows; row++) {
			for(int col = 0; col < cols; col++){
				grid[row][col] = vals[(int)(Math.random() * vals.length)];
			}
		}
		System.out.println(findMax(vals));
		System.out.println();
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{		
		int greatestCount = -1;
		int greatestCountIndex = -1;
		for(int index = 0; index < vals.length; index++) {
			int count = countVals(vals[index]);
			System.out.println(vals[index] + " count is " + count);
			if(count > greatestCount) {
				greatestCount = count;
				greatestCountIndex = index;
			}
		}
		return vals[greatestCountIndex] + " occurs the most.";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for(int row = 0; row < grid.length; row++) {
			for(int col = 0; col < grid[row].length; col++){
				if(grid[row][col].equals(val)) {
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for(int row = 0; row < grid.length; row++) {
			for(int col = 0; col < grid[row].length; col++) {
				output += grid[row][col] + " ";
			}
			output += "\n";
		}
		return output;
	}
}