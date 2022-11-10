package unit03.EventExam;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class ClickRandomLocation extends JFrame implements MouseListener {

	JLabel lb = new JLabel("나 잡아봐라!");
	JPanel p = new JPanel();
	
	ClickRandomLocation() {
		
		
		add(p);
		p.add(lb);
		p.setLayout(null);
		
		lb.setBounds(50, 50, 100, 40);
		
		lb.addMouseListener(this);
		
		setTitle("클릭 연습");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ClickRandomLocation();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == lb) {
			
			int xBound = p.getWidth() - lb.getWidth() + 1;
			int yBound = p.getHeight() - lb.getHeight() + 1;
			
			lb.setLocation((int)(Math.random()*xBound), (int)(Math.random()*yBound));
		}
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
