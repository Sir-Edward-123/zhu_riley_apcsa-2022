//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy toy1 = new Toy("sorry");
		Toy toy2 = new Toy("gi joe");
		Toy toy3 = new Toy("hot wheels");
		toy1.setCount(1);
		toy2.setCount(5);
		toy3.setCount(27);
		
		System.out.println(toy1);
		System.out.println(toy2);
		System.out.println(toy3);
	}
}