//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		setXSpeed(3);
		setYSpeed(1);
	}

	//add the other Ball constructors
	public Ball(int x, int y) {
		super(x,y);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int width, int height) {
		super(x,y,width,height);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int width, int height, Color color) {
		super(x,y,width,height,color);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int width, int height, Color color, int xSpd, int ySpd) {
		super(x,y,width,height,color);
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}
	
	   
	//add the set methods
	public void setXSpeed(int xSpd){
		xSpeed = xSpd;
	}
	
	public void setYSpeed(int ySpd) {
		ySpeed = ySpd;
	}
   

	public void moveAndDraw(Graphics window)
	{
		//draw a white ball at old ball location
		window.setColor(Color.WHITE);
		window.fillRect(getX(), getY(), getWidth(), getHeight());

		setX(getX() + xSpeed);
		//setY
		setY(getY() + ySpeed);

		//draw the ball at its new location
		window.setColor(getColor());
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
   
	public boolean equals(Object obj)
	{
		Ball otherBall = (Ball) obj;
		if(this.getX() != otherBall.getX()) {
			return false;
		}
		if(this.getY() != otherBall.getY()) {
			return false;
		}
		if(this.getWidth() != otherBall.getWidth()) {
			return false;
		}
		if(this.getHeight() != otherBall.getHeight()) {
			return false;
		}
		if(!(this.getColor().equals(otherBall.getColor()))) {
			return false;
		}
		if(this.getXSpeed() != otherBall.getXSpeed()) {
			return false;
		}
		if(this.getYSpeed() != otherBall.getYSpeed()) {
			return false;
		}

		return true;
	}   

	//add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}

	//add a toString() method
	public String toString() {
		return getX() + " , " + getY() + " , " + getWidth() + " , " + getHeight() + " , " + getColor().toString() + " , "
				+ getXSpeed() + " , " + getYSpeed();
	}

	@Override
	public boolean didCollideLeft(Object obj) {
		Paddle paddle = (Paddle) obj;
		int collisionX = this.getX();
		
		
		if(collisionX >= paddle.getX() && collisionX <= paddle.getX()+paddle.getWidth()) {
			if(this.getY() >= paddle.getY()-this.getHeight() && this.getY() <= paddle.getY()+paddle.getHeight()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean didCollideRight(Object obj) {
		Paddle paddle = (Paddle) obj;
		int collisionX = this.getX() + this.getWidth();
		
		
		if(collisionX >= paddle.getX() && collisionX <= paddle.getX()+paddle.getWidth()) {
			if(this.getY() >= paddle.getY()-this.getHeight() && this.getY() <= paddle.getY()+paddle.getHeight()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean didCollideTop(Object obj) {
		Paddle paddle = (Paddle) obj;
		int collisionY = this.getY();
		
		if(collisionY >= paddle.getY() && collisionY <= paddle.getY()+paddle.getHeight()) {
			if(this.getX() >= paddle.getX() - paddle.getWidth() && this.getX() <= paddle.getX()+paddle.getWidth()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean didCollideBottom(Object obj) {
		Paddle paddle = (Paddle) obj;
		int collisionY = this.getY() + this.getHeight();
		
		if(collisionY >= paddle.getY() && collisionY <= paddle.getY()+paddle.getHeight()) {
			if(this.getX() >= paddle.getX() - paddle.getWidth() && this.getX() <= paddle.getX()+paddle.getWidth()) {
				return true;
			}
		}
		return false;
	}
}