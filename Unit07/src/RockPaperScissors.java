//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Riley Zhu

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("Rock");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		
		int randomChoice = (int) (Math.random() * 3);
		switch(randomChoice) {
		case 0:
			compChoice = "Rock";
			break;
		case 1:
			compChoice = "Paper";
			break;
		case 2:
			compChoice = "Scissors";
			break;
		}
	}

	public String determineWinner()
	{
		String winner = "";
		if(playChoice.equals(compChoice)) {
			winner = "draw";
		} else if(playChoice.equals("Scissors") && compChoice.equals("Paper")) {
			winner = "player";
		} else if(playChoice.equals("Paper") && compChoice.equals("Rock")) {
			winner = "player";
		} else if(playChoice.equals("Rock") && compChoice.equals("Scissors")) {
			winner = "player";
		} else {
			winner = "computer";
		}
		
		return winner;
	}

	public String toString()
	{
		String output = "";
		if(determineWinner().equals("draw")) {
			output = "Draw Game! Both Player and Computer chose " + playChoice + "!\n";
		} else if(determineWinner().equals("player")) {
			output = "Player wins <<" + playChoice;
			switch(playChoice) {
			case "Rock":
				output += " breaks ";
				break;
			case "Paper":
				output += " covers ";
				break;
			case "Scissors":
				output += " cuts ";
			}
			output += compChoice + ">>!\n";
		} else if(determineWinner().equals("computer")) {
			output = "Computer wins <<" + compChoice;
			switch(compChoice) {
			case "Rock":
				output += " breaks ";
				break;
			case "Paper":
				output += " covers ";
				break;
			case "Scissors":
				output += " cuts ";
			}
			output += playChoice + ">>!\n";
		}
		
		return output;
	}
}