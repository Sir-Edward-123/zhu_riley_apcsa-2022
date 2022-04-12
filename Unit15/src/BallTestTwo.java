//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

class BallTestTwo extends Canvas implements Runnable
{
	private Ball ball;
	
	// Whoops, added this before I realized the Tester class was there
	/*
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		BallTestTwo btt = new BallTestTwo();
		
		frame.setSize(570 + btt.ball.getWidth(), 470 + btt.ball.getHeight());
		frame.add(btt);
		btt.repaint();
		frame.setVisible(true);
	}
	*/

	public BallTestTwo()
	{
		setBackground(Color.WHITE);
		setVisible(true);

		//instantiate a new Ball
		ball = new Ball();
		
		//test all constructors
		//ball = new Ball(500,300);
		//ball = new Ball(200, 100, 50, 50);
		//ball = new Ball(300, 300, 30, 30, Color.RED);
		//ball = new Ball(300, 300, 5, 5, Color.BLUE, 4, 4);

		//test the Ball thoroughly
		Ball testBall = new Ball();
		System.out.println(testBall.equals(ball));
		System.out.println(ball.getXSpeed());
		System.out.println(ball.getYSpeed());


		new Thread(this).start();
	}
	
	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		ball.moveAndDraw(window);

		if(!(ball.getX()>=10 && ball.getX()<=550))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}

		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
	}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(19);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}