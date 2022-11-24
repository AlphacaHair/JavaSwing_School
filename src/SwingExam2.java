import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class SwingExam2 extends JFrame implements KeyListener, MouseListener {


	JPanel p = new JPanel();
	
	String [] data = {"설계과", "제어과", "시스템과", "정보통신과"};
	JComboBox<String> combo = new JComboBox<String>(data);
	
	JTextField tf = new JTextField(10);//여기 숫자 쓰는거 잊지 말기
	
	JLabel lb_result = new JLabel("<Enter>키를 누르면 소속과 이름을 보여줍니다.");
	
	public SwingExam2() {
		
		add(p);
		
		JLabel lb1 = new JLabel("학과 : ");
		JLabel lb2 = new JLabel("이름 : ");
		
		p.add(lb1);
		p.add(combo);
		p.add(lb2);
		p.add(tf);
		p.add(lb_result);
		
		//이벤트 달기
		
		tf.addKeyListener(this); //이거 두개 
		p.addMouseListener(this); //잊지 말기
		
		setTitle("수행평가2");
		setSize(400, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingExam2();
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
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		p.setBackground(new Color(r, g ,b)); //이거 문장 기억하기 
	}

	@Override
	public void mouseExited(MouseEvent e) {
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		p.setBackground(new Color(r, g ,b)); //이거 문장 기억하기 
	}

	@Override
	public void keyTyped(KeyEvent e) {
		String str = tf.getText().trim();
		int i = combo.getSelectedIndex();
		if(e.getKeyChar() == '\n' && str.length() > 0) //여기 문장 전체 싹다 외우기
			lb_result.setText("당신은 " + data[i] + " " + str + "입니다.");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
