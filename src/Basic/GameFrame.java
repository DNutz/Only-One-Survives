package Basic;

import java.awt.Dimension;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.JFrame;
//import java.awt.GridLayout;

public class GameFrame extends JFrame{

	public static int WIDTH = 500;
	public static int HEIGHT = 500;
	public GameScreen s;


	public GameFrame() throws UnknownHostException, IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Only One Survives");
		setResizable(false);
		init();
	}


	public void init() throws UnknownHostException, IOException {
		//setLayout(new GridLayout(1,1,0,0));
		s = new GameScreen();
		s.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		add(s);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}


	/*public static void main(String[] args){
		Frame f = new Frame();
	}*/

}
