//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsRunner
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
	  StarsAndStripes sas = new StarsAndStripes();
      
      //call the methods needed to make the patterns on the word document
	  sas.printASmallBox();
	  sas.printTwoBlankLines();
	  sas.printABigBox();
	  sas.printTwoBlankLines();
	  sas.printCustomBox();
   }
}