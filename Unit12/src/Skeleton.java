//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	private String name;
	private int size;
	
	//add a constructor
	public Skeleton(String name, int size) {
		this.name = name;
		this.size = size;
	}

	//add code to implement the Monster interface
	@Override
	public int getHowBig() {
		return size;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isBigger(Monster other) {
		return getHowBig() > other.getHowBig();
	}

	@Override
	public boolean isSmaller(Monster other) {
		return getHowBig() < other.getHowBig();
	}

	@Override
	public boolean namesTheSame(Monster other) {
		return getName().equals(other.getName());
	}

	//add a toString
	public String toString() {
		return getName() + " " + getHowBig();
	}
}