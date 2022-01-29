//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu
//Date - January 28, 2022


public class FirstLastVowel
{
   public static String go( String a )
	{
	   if( isVowel(a.charAt(0)) || isVowel(a.charAt(a.length() - 1)) ) {
		   return "yes";
	   } else {
		   return "no";
	   }
	   
	}
   
   public static boolean isVowel(char letter) {
	   char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
	   for(int i = 0; i < vowels.length; i++) {
		   if(letter == vowels[i]) {
			   return true;
		   }
	   }
	   return false;
   }
   
}