package Basic;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Screen extends JPanel implements ActionListener, KeyListener{

Timer t = new Timer(10,this);
Player p;


	public Screen(){
		p = new Player(0,0,Player.PLAYER_WIDTH,Player.PLAYER_HEIGHT);
		addKeyListener(this);
		setFocusable(true);
		
		t.start();
	}


	public void actionPerformed(ActionEvent e) {
		p.tick();
		repaint();
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
