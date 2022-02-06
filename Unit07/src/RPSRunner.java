//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Riley Zhu

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		do {
			String player = "";
			out.print("type in your prompt [R,P,S] :: ");
			
			//read in the player value
			response = keyboard.next().charAt(0);
			switch(response) {
			case 'R':
				player = "Rock";
				break;
			case 'P':
				player = "Paper";
				break;
			case 'S':
				player = "Scissors";
				break;
			default:
				out.print("That's not a valid option.\n");
				continue;
			}
		
			RockPaperScissors game = new RockPaperScissors(player);
			out.print(game);
		} while(true);
		
	}
}



