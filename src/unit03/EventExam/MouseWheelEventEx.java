package unit03.EventExam;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseWheelEventEx extends JFrame implements MouseWheelListener {

	JLabel lb = new JLabel("Love Java");
	int fontSize = 30;
	
	MouseWheelEventEx(){
		
		add(lb);
		lb.setFont(new Font("����ü", Font.BOLD, fontSize));
		
		lb.addMouseWheelListener(this);
		
		setTitle("���콺 �� ����");
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseWheelEventEx();
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		if(e.getWheelRotation() < 0) {	//���� �÷�����
			fontSize += 10;
			lb.setFont(new Font("����ü", Font.BOLD, fontSize));
		} else { //�Ʒ��� ������
			fontSize -= 10;
			lb.setFont(new Font("����ü", Font.BOLD, fontSize));
		}
	}

}
