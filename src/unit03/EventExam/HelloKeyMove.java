package unit03.EventExam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloKeyMove extends JFrame implements KeyListener {

	JPanel p = new JPanel();
	JLabel lb = new JLabel("Hello");
	
	HelloKeyMove(){
	
		add(p);
		p.setLayout(null); //절대값 레이아웃 사용
		
		p.add(lb);
		lb.setLocation(50, 50);
		lb.setSize(50, 50);
		
		p.addKeyListener(this);
		
		setTitle("키 이벤트 예제");
		setSize(300, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		p.setFocusable(true);
		p.requestFocus();
	}
	
	public static void main(String[] args) {
		new HelloKeyMove();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		
		switch(keycode) {
		case KeyEvent.VK_UP : lb.setLocation(lb.getX(), lb.getY()-10); break;
		case KeyEvent.VK_DOWN : lb.setLocation(lb.getX(), lb.getY()+10); break;
		case KeyEvent.VK_LEFT : lb.setLocation(lb.getX()-10, lb.getY()); break;
		case KeyEvent.VK_RIGHT : lb.setLocation(lb.getX()+10, lb.getY()); break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
