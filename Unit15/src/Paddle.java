//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	   super(10,10);
	   setSpeed(5);
   }


   //add the other Paddle constructors
   public Paddle(int x, int y) {
	   super(x,y);
	   setSpeed(5);
   }

   public Paddle(int x, int y, int width) {
	   super(x,y,width,60);
	   setSpeed(5);
   }

   public Paddle(int x, int y, int width, int height) {
	   super(x,y,width,height);
	   setSpeed(5);
   }

   public Paddle(int x, int y, int width, int height, int spd) {
	   super(x,y,width,height);
	   setSpeed(spd);
   }

   public Paddle(int x, int y, int width, int height, Color color, int spd) {
	   super(x,y,width,height,color);
	   setSpeed(spd);
   }
   

   public void moveUpAndDraw(Graphics window)
   {
	   	window.setColor(Color.WHITE);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	   
		setY(getY() - speed);

		window.setColor(getColor());
		window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void moveDownAndDraw(Graphics window)
   {
	   	window.setColor(Color.WHITE);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	   
		setY(getY() + speed);

		window.setColor(getColor());
		window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   //add get methods
   public int getSpeed() {
	   return speed;
   }
   
   public void setSpeed(int speed) {
	   this.speed = speed;
   }
   
   //add a toString() method
   public String toString() {
		return getX() + " , " + getY() + " , " + getWidth() + " , " + getHeight() + " , " + getColor().toString() + " , " + getSpeed();
   }
}