package launch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.sun.xml.internal.ws.api.Component;

public class LaunchScreen extends JPanel implements ActionListener, MouseListener{

	//Timer t = new Timer(10, this);
	
	public LaunchScreen(){
		addMouseListener(this);
		setFocusable(true);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		ImageIcon icon = new ImageIcon("Slide1.png");
		JLabel label = new JLabel(icon);
		add(label);
		label.setAlignmentX(CENTER_ALIGNMENT);
		
		//t.start();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
