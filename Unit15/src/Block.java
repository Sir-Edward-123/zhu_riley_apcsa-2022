//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setPos(100,150);
		setWidth(10);
		setHeight(10);
		setColor(Color.BLACK);
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y) {
		setPos(x,y);
		setWidth(10);
		setHeight(10);
		setColor(Color.BLACK);
	}
	
	public Block(int x, int y, int width, int height) {
		setPos(x,y);
		setWidth(width);
		setHeight(height);
		setColor(Color.BLACK);
	}
	
	public Block(int x, int y, int width, int height, Color col) {
		setPos(x,y);
		setWidth(width);
		setHeight(height);
		setColor(col);
	}
	
	//add the other set methods
	@Override
	public void setPos(int x, int y) {
		setX(x);
		setY(y);
	}
	
	@Override
	public void setX(int x) {
		xPos = x;
	}
	
	@Override
	public void setY(int y) {
		yPos = y;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	public void setColor(Color col)
	{
		color = col;
	}

	public void draw(Graphics window)
	{
		//uncomment after you write the set and get methods
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void draw(Graphics window, Color col)
	{
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
   
	public boolean equals(Object obj)
	{
		Block otherBlock = (Block) obj;
		if(this.getX() != otherBlock.getX()) {
			return false;
		}
		if(this.getY() != otherBlock.getY()) {
			return false;
		}
		if(this.getWidth() != otherBlock.getWidth()) {
			return false;
		}
		if(this.getHeight() != otherBlock.getHeight()) {
			return false;
		}
		if(!(this.getColor().equals(otherBlock.getColor()))) {
			return false;
		}

		return true;
	}

	//add the other get methods
	@Override
	public int getX() {
		return xPos;
	}

	@Override
	public int getY() {
		return yPos;
	}   
    
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public Color getColor() {
		return color;
	}

	//add a toString() method  - x , y , width, height, color
	public String toString() {
		return getX() + " , " + getY() + " , " + getWidth() + " , " + getHeight() + " , " + getColor().toString();
	}
}