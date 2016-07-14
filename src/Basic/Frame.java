package Basic;

import java.awt.Dimension;
import javax.swing.JFrame;
//import java.awt.GridLayout;

public class Frame extends JFrame{

	public static int WIDTH = 500;
	public static int HEIGHT = 500;


	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Only One Survives");
		setResizable(false);
		init();
	}


	public void init() {
		//setLayout(new GridLayout(1,1,0,0));
		Screen s = new Screen();
		s.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		add(s);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}


	public static void main(String[] args){
		Frame f = new Frame();
	}

}
