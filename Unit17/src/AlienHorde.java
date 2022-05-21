//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		
		int numPerRow = 11;
		for(int row = 0; row < size/numPerRow; row++) {
			for(int col = 0; col < numPerRow; col++) {
				add(new Alien(100+col*50, 50+row*100, 30, 30, 1));
			}
		}
		
		for(int col = 0; col < size%numPerRow; col++) {
			add(new Alien(100+col*50, 50+(size/numPerRow)*100, 30, 30, 1));
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}
	
	public List<Alien> getAliens() {
		return aliens;
	}

	public void drawEmAll( Graphics window )
	{
		for(int index = 0; index < aliens.size(); index++) {
			aliens.get(index).draw(window);
		}
	}

	public void moveEmAll()
	{
		for(int index = 0; index < aliens.size(); index++) {
			Alien ref = aliens.get(index);
			if(ref.getX() < 20 || ref.getX() > 740) {
				ref.setSpeed(-ref.getSpeed());
				ref.setY(ref.getY() + 50);
			}
			ref.move("RIGHT");
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int s = 0; s < shots.size(); s++) {
			for(int a = 0; a < aliens.size(); a++) {
				Alien aRef = aliens.get(a);
				Ammo sRef = shots.get(s);
				if(sRef.getX() > aRef.getX()-sRef.getWidth() && sRef.getX() < aRef.getX()+aRef.getWidth()) {
					if(sRef.getY() > aRef.getY()-sRef.getHeight() && sRef.getY() < aRef.getY()+aRef.getHeight()) {
						aliens.remove(a);
						shots.remove(s);
						s--;
						break;
					}
				}
			}
		}
		
	}

	public String toString()
	{
		return "";
	}
}
