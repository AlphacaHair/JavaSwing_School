package unit03.EventExam;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class HelloGamble extends JFrame implements KeyListener{

	JLabel lb1 = new JLabel("0", JLabel.CENTER);
	JLabel lb2 = new JLabel("0", JLabel.CENTER);
	JLabel lb3 = new JLabel("0", JLabel.CENTER);
	JLabel lbr = new JLabel("�����մϴ�.", JLabel.CENTER);
	JLabel tryn = new JLabel("�õ�Ƚ�� : 0", JLabel.CENTER);
	
	HelloGamble(){
		
		JPanel p = new JPanel();
		add(p);
		
		p.setLayout(null);
		
		lb1.setBounds(30, 50, 60, 30); lb2.setBounds(105, 50, 60, 30); lb3.setBounds(180, 50, 60, 30);
		lb1.setOpaque(true); lb2.setOpaque(true); lb3.setOpaque(true);
		lb1.setBackground(Color.pink); lb2.setBackground(Color.pink); lb3.setBackground(Color.pink);
		
		p.add(lb1); p.add(lb2); p.add(lb3); add(lbr, BorderLayout.SOUTH); add(tryn, BorderLayout.NORTH);
		
		p.addKeyListener(this);
		
		setSize(300, 200);
		setTitle("�׺�����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus();
	}
	public static void main(String[] args) {
		new HelloGamble();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	int trynum = 0;
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar() == '\n') {
			int n1 = (int)(Math.random()*5); 
			int n2 = (int)(Math.random()*5); 
			int n3 = (int)(Math.random()*5);
			trynum += 1;
			
			lb1.setText(Integer.toString(n1)); 
			lb2.setText(Integer.toString(n2)); 
			lb3.setText(Integer.toString(n3));
			tryn.setText("�õ�Ƚ�� : " + Integer.toString(trynum));
			
			if(n1 == n2 && n2 == n3) {
				lbr.setText("�����մϴ�!");
			} else
				lbr.setText("�ƽ�����!");
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
