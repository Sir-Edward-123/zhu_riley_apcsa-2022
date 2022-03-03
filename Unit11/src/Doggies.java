//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
		if(spot < pups.length) {
			pups[spot] = new Dog(age, name);
		}
	}

	public String getNameOfOldest()
	{
		int oldestIndex = 0;
		for(int index = 1; index < pups.length; index++) {
			if(pups[index].getAge() > pups[oldestIndex].getAge()) {
				oldestIndex = index;
			}
		}
		return pups[oldestIndex].getName();
	}

	public String getNameOfYoungest()
	{
		int youngestIndex = 0;
		for(int index = 1; index < pups.length; index++) {
			if(pups[index].getAge() < pups[youngestIndex].getAge()) {
				youngestIndex = index;
			}
		}
		return pups[youngestIndex].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}