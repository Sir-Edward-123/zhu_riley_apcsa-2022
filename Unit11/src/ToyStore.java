//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		Scanner toyScan = new Scanner(toys);
		String currentToyName;
		while(toyScan.hasNext()) {
			//toyList.add(new Toy(toyScan.next()));
			currentToyName = toyScan.next();
			boolean newToy = true;
			for(int index = 0; index < toyList.size(); index++) {
				if(toyList.get(index).getName().equals(currentToyName)){
					newToy = false;
					toyList.get(index).setCount(toyList.get(index).getCount() + 1);
					break;
				}
			}
			if(newToy) {
				toyList.add(new Toy(currentToyName));
				toyList.get(toyList.size() - 1).setCount(1);
			}
		}
		toyScan.close();
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(int index = 0; index < toyList.size(); index++) {
  			if(toyList.get(index).getName().equals(nm)) {
  				return toyList.get(index);
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int mostFrequentIndex = 0;
  		for(int index = 0; index < toyList.size(); index++) {
  			if(toyList.get(index).getCount() > toyList.get(mostFrequentIndex).getCount()) {
  				mostFrequentIndex = index;
  			}
  		}
  		return toyList.get(mostFrequentIndex).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		for(int iteration = 0; iteration < toyList.size(); iteration++) {
  			int leastIndex = iteration;
  			for(int index = iteration; index < toyList.size(); index++) {
  				if(toyList.get(index).getCount() < toyList.get(leastIndex).getCount()) {
  					leastIndex = index;
  				}
  			}
  			Toy tmp = toyList.get(iteration);
  			toyList.set(iteration, toyList.get(leastIndex));
  			toyList.set(leastIndex, tmp);
  		}
  	}  
  	  
	public String toString()
	{
		if(toyList.isEmpty()) {
			return "[]";
		}
		
		String output = "[";
		for(int index = 0; index < toyList.size() - 1; index++) {
			output += toyList.get(index) + ", ";
		}
		output += toyList.get(toyList.size() - 1) + "]"; //So the comma doesn't appear for the last element
	    return output;
	}
}