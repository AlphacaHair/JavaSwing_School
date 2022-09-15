package unit03.LayoutExam;

import java.awt.Color;
import java.util.Set;

import javax.swing.*;

public class HelloPanel extends JFrame {

	HelloPanel(){
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.orange);
		add(p1);
		
		JButton b1 = new JButton("��ư1");
		JButton b2 = new JButton("��ư2");
		
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.gray);
		
		p1.add(b1);
		p1.add(b2);
		
		setTitle("�ȳ� �г�");
		setSize(300, 100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new HelloPanel();
		
	}

}
