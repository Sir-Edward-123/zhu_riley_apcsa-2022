//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   String stars = "********************";
	   System.out.println(stars);
   }

   public void printTwentyDashes()
   {
	   String stripes = "--------------------";
	   System.out.println(stripes);
   }

   public void printTwoBlankLines()
   {
	   System.out.println("\n\n");
   }
   
   public void printASmallBox()
   {
	   for(int i = 0; i < 3; i++) {
		   printTwentyDashes();
		   printTwentyStars();
	   }
	   printTwentyDashes();
   }
 
   public void printABigBox()
   {
	   printASmallBox();
	   printASmallBox();
   }   
   
   public void printCustomBox() {
	   for(int i = 1; i <= 5; i++) {
		   for(int j = 0; j < i; j++) {
			   printTwentyDashes();
		   }
		   for(int j = 0; j < i; j++) {
			   printTwentyStars(); 
		   }
	   }
   }
   
}