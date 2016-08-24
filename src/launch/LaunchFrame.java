package launch;

import java.awt.Dimension;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.JFrame;

import gameplay.GameScreen;

public class LaunchFrame extends JFrame{

	public static int WIDTH = 500;
	public static int HEIGHT = 500;
	public LaunchScreen ts;


	public LaunchFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Only One Survives");
		setResizable(false);
		ts = new LaunchScreen();
		ts.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		add(ts);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
}
