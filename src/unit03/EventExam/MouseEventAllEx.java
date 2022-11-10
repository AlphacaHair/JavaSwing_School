package unit03.EventExam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventAllEx extends JFrame implements MouseListener, MouseMotionListener {

	JPanel p = new JPanel();
	JLabel lb = new JLabel("��������");
	
	MouseEventAllEx(){
		
		add(p);
		p.add(lb);
		p.setLayout(null);
		
		lb.setBounds(100, 50, 80, 60);
		
		p.addMouseListener(this);
		p.addMouseMotionListener(this);
		
		setTitle("���콺 �̺�Ʈ");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MouseEventAllEx();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		lb.setLocation(e.getX(), e.getY());
		setTitle("���콺�� �巡�� �ǰ� �ִ� ��ġ (" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		lb.setLocation(e.getX(), e.getY());
		setTitle("���콺�� �����̰� �ִ� ��ġ (" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		if(e.getClickCount() == 2) {
			lb.setLocation(e.getX(), e.getY());
			setTitle("���� Ŭ�� �Ǵ� ��ġ (" + e.getX() + ", " + e.getY() + ")");
		} else {
			lb.setLocation(e.getX(), e.getY());
			setTitle("���콺�� Ŭ���� ��ġ (" + e.getX() + ", " + e.getY() + ")");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		lb.setLocation(e.getX(), e.getY());
		setTitle("���콺�� ������ ��ġ (" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		lb.setLocation(e.getX(), e.getY());
		setTitle("���콺�� ������ ��ġ (" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		p.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		p.setBackground(Color.red);
	}

}
