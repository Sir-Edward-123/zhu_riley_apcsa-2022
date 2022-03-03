//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore ts1 = new ToyStore();
		System.out.println(ts1);
		ts1.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		System.out.println(ts1);
		System.out.println("max == " + ts1.getMostFrequentToy());
		ts1.sortToysByCount();
		System.out.println(ts1);
		
		System.out.println();
		
		ToyStore ts2 = new ToyStore();
		System.out.println(ts2);
		ts2.loadToys("sorry bat sorry sorry teddy train sorry train train teddy teddy ball train ball sorry ");
		System.out.println(ts2);
		System.out.println("max == " + ts2.getMostFrequentToy());
		ts2.sortToysByCount();
		System.out.println(ts2);
	}
}