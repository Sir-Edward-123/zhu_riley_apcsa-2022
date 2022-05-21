//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

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
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	//private Alien alienOne;
	//private Alien alienTwo;

	/* uncomment once you are ready for this part */
	 private AlienHorde horde;
	 private Bullets shots;
	

	private boolean[] keys;
	private BufferedImage back;
	long timeNow;
	long timeOfLastShot;
	long timeOfLastAlienShot;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(400, 500, 30, 50, 2);
		horde = new AlienHorde(33);
		shots = new Bullets();
		//alienOne = new Alien(300, 50, 40, 40, 1);
		//alienTwo = new Alien(400, 50, 40, 40, 1);
		timeNow = System.currentTimeMillis();
		timeOfLastShot = 0;
		timeOfLastAlienShot = 0;

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
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

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		//add code to move Ship, Alien, etc.
		if(keys[0] == true) {
			ship.move("LEFT");
		}
		if(keys[1] == true) {
			ship.move("RIGHT");
		}
		if(keys[2] == true) {
			ship.move("UP");
		}
		if(keys[3] == true) {
			ship.move("DOWN");
		}
		
		timeNow = System.currentTimeMillis();
		if(keys[4] == true) {
			if(timeNow - timeOfLastShot > 500) {
				timeOfLastShot = timeNow;
				shots.add(new Ammo(ship.getX()+ship.getWidth()/2, ship.getY()-10, 3));
			}
		}
		
		if(timeNow - timeOfLastAlienShot > horde.getAliens().size()*50 + 200) {
			timeOfLastAlienShot = timeNow;
			Alien shootingAlien = horde.getAliens().get(horde.getAliens().size() - 1);
			shots.add(new Ammo(shootingAlien.getX()+shootingAlien.getWidth()/2, shootingAlien.getY() + shootingAlien.getHeight(), -2));
		}
		
		shots.moveEmAll();
		horde.moveEmAll();
		
		shots.cleanEmUp();

		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		horde.removeDeadOnes(shots.getList());
		
		for(int i = 0; i < shots.getList().size(); i++) {
			Ammo sRef = shots.getList().get(i);
			if(sRef.getX() > ship.getX()-sRef.getWidth() && sRef.getX() < ship.getX()+ship.getWidth()) {
				if(sRef.getY() > ship.getY()-sRef.getHeight() && sRef.getY() < ship.getY()+ship.getHeight()) {
					System.out.println("YOU LOSE! You were shot down.");
					System.exit(0);
				}
			}
		}
		
		for(int k = 0; k < horde.getAliens().size(); k++) {
			Alien aRef = horde.getAliens().get(k);
			if(aRef.getX() > ship.getX()-aRef.getWidth() && aRef.getX() < ship.getX()+ship.getWidth()) {
				if(aRef.getY() > ship.getY()-aRef.getHeight() && aRef.getY() < ship.getY()+ship.getHeight()) {
					System.out.println("YOU LOSE! You were captured.");
					System.exit(0);
				}
			}
		}

		ship.draw(twoDGraph);
		shots.drawEmAll(twoDGraph);
		horde.drawEmAll(twoDGraph);
		
		
		//alienOne.draw(window);
		//alienTwo.draw(window);
		twoDGraph.drawImage(back, null, 0, 0);
		
		if(horde.getAliens().size() == 0) {
			System.out.println("YOU WIN! The alien horde was defeated.");
			//JOptionPane.showMessageDialog(null, "YOU WIN!");
			System.exit(0);
		}
		for(int j = 0; j < horde.getAliens().size(); j++) {
			if(horde.getAliens().get(j).getY() > 500) {
				System.out.println("YOU LOSE! Aliens invaded the planet.");
				//JOptionPane.showMessageDialog(null, "YOU LOSE!");
				System.exit(0);
			}
		}
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

