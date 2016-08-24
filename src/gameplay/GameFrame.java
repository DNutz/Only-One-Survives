package gameplay;

import java.awt.Dimension;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.JFrame;
//import java.awt.GridLayout;

public class GameFrame extends JFrame{

	//public static int WIDTH = 500;
	//public static int HEIGHT = 500;
	public GameScreen gs;


	public GameFrame() throws UnknownHostException, IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Only One Survives");
		setResizable(false);
		init();
	}


	public void init() throws UnknownHostException, IOException {
		//setLayout(new GridLayout(1,1,0,0));
		gs = new GameScreen();
		gs.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		add(gs);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}


	/*public static void main(String[] args){
		Frame f = new Frame();
	}*/

}
