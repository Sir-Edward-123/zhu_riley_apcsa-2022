//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	
	int leftScore = 0;
	int rightScore = 0;


	public Pong()
	{
		//set up all variables related to the game
		int paddleWidth = 15;
		int paddleHeight = 60;
		int paddleSpeed = 4;
		
		int sideOffset = 25;
		int leftPaddleX = sideOffset;
		int rightPaddleX = 780 - paddleWidth - sideOffset;
		int paddleStartY = 200;
		
		Color paddleColor = Color.BLUE;
		
		//ball = new Ball();
		//ball = new BlinkyBall();
		ball = new SpeedUpBall();
		leftPaddle = new Paddle(leftPaddleX, paddleStartY, paddleWidth, paddleHeight, paddleColor, paddleSpeed);
		rightPaddle = new Paddle(rightPaddleX, paddleStartY, paddleWidth, paddleHeight, paddleColor, paddleSpeed);

		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   	paint(window);
	   
	   	//see if the ball hits the left paddle
	   	if(ball.didCollideLeft(leftPaddle)) {
	   		ball.setXSpeed(-ball.getXSpeed());
	   	} else if(ball.didCollideBottom(leftPaddle) || ball.didCollideTop(leftPaddle)) {
	   		ball.setXSpeed(-ball.getXSpeed());
	   		ball.setYSpeed(-ball.getYSpeed());
	   	}
		
	   	//see if the ball hits the right paddle
	   	if(ball.didCollideRight(rightPaddle)) {
	   		ball.setXSpeed(-ball.getXSpeed());
	   	} else if(ball.didCollideBottom(rightPaddle) || ball.didCollideTop(rightPaddle)) {
	   		ball.setXSpeed(-ball.getXSpeed());
	   		ball.setYSpeed(-ball.getYSpeed());
	   	}
	   	
		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=760))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			
			if(ball.getX() < 10) {
				rightScore++;
			} else {
				leftScore++;
			}
			
			//ball = new Ball();
			//ball = new BlinkyBall();
			ball = new SpeedUpBall();
		}

		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=10 && ball.getY()<=560)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		
		//Background for score to prevent score text from overlapping on itself upon repaint
		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(20, 10, 100, 50);
		graphToBack.fillRect(690, 10, 100, 50);
		
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("Left Score: " + leftScore, 20, 20);
		graphToBack.drawString("Right Score:" + rightScore, 690, 20);
		
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		

		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}