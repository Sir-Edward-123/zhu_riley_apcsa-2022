//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import java.awt.Canvas;

public class BlockTestTwo extends Canvas
{
	// Whoops, added this before I realized the Tester class was there
	/*
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		BlockTestTwo btt = new BlockTestTwo();
		
		frame.setSize(1000, 800);
		frame.add(btt);
		btt.repaint();
		frame.setVisible(true);
	}
	*/
	
	public BlockTestTwo()
	{
		setBackground(Color.WHITE);
	}

	public void paint(Graphics window)
	{
		Block one = new Block();
		one.draw(window);

		Block two = new Block(50,50,30,30);
		two.draw(window);

		Block three = new Block(350,350,15,15,Color.RED);
		three.draw(window);

		//two.draw(window, Color.white);

		Block four = new Block(450,50,20,60, Color.GREEN);
		four.draw(window);
		
		//add more test cases	
		Block five = new Block(10, 10, 50, 500, Color.YELLOW);
		five.draw(window);
		
		Block six = new Block(60, 400, 40, 90, Color.BLUE);
		six.draw(window);
	}
	
}