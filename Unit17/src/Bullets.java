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

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
		ammo.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for(int index = 0; index < ammo.size(); index++) {
			ammo.get(index).draw(window);
		}
	}

	public void moveEmAll()
	{
		for(int index = 0; index < ammo.size(); index++) {
			ammo.get(index).move("UP");
		}
	}

	public void cleanEmUp()
	{
		for(int index = 0; index < ammo.size(); index++) {
			if(ammo.get(index).getY() < -50) {
				ammo.remove(index);
				index--;
			}
		}
	}

	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return "";
	}
}
