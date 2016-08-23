package Basic;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.JPanel;
import javax.swing.Timer;

import clientServer.Client;


public class GameScreen extends JPanel implements ActionListener, KeyListener{

Timer t = new Timer(10,this);
Player p;
Client c;



	public GameScreen() throws UnknownHostException, IOException{
		p = new Player(0,0,Player.PLAYER_WIDTH,Player.PLAYER_HEIGHT);
		addKeyListener(this);
		setFocusable(true);
		c = new Client();
		c.init();
		
		t.start();
	}
	
	
	public int getPlayerX(){
		return (int) p.getX();
	}
	
	public int getPlayerY(){
		return (int) p.getY();
	}


	public void actionPerformed(ActionEvent e) {
		p.tick();
		repaint();
		//update other players
		int x = getPlayerX();
		int y = getPlayerY();
		String position = x + "," + y;
		c.updateOthers(position);
	}


	public void paint(Graphics g){
		g.clearRect(0, 0, getWidth(), getHeight());
		p.draw(g);
	}


	public void keyTyped(KeyEvent k) {

	}

	public void keyPressed(KeyEvent k) {
		switch(k.getKeyCode()){
			case KeyEvent.VK_D:
			p.incrementDx();
			break;
			case KeyEvent.VK_S:
			p.incrementDy();
			break;
			case KeyEvent.VK_A:
			p.decrementDx();
			break;
			case KeyEvent.VK_W:
			p.decrementDy();
			break;
		}
	}

	public void keyReleased(KeyEvent k) {
		switch(k.getKeyCode()){
			case KeyEvent.VK_D:
			p.decrementDx();
			break;
			case KeyEvent.VK_S:
			p.decrementDy();
			break;
			case KeyEvent.VK_A:
			p.incrementDx();
			break;
			case KeyEvent.VK_W:
			p.incrementDy();
			break;
		}
	}
	
}
