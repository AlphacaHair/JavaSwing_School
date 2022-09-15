package unit03.LayoutExam;

import javax.swing.*;

public class HelloAbsoluteLayout extends JFrame {

	HelloAbsoluteLayout(){
		 
		setLayout(null);
		
		JButton b1 = new JButton("��ư1");
		b1.setSize(70, 40);
		b1.setLocation(10, 30);
		
		JButton b2 = new JButton("��ư2");
		b2.setBounds(150, 30, 90, 20);
		
		add(b1);
		add(b2);
		
		setTitle("��ġ�����ڰ� ���� ���밪 ���̾ƿ�");
		setSize(350, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new HelloAbsoluteLayout();
	}

}
