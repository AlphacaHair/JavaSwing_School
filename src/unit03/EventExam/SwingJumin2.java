package unit03.EventExam;

import java.awt.event.*;

import javax.swing.*;


public class SwingJumin2 extends JFrame implements KeyListener, ActionListener {

	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JButton btn = new JButton("버튼");
	
	SwingJumin2(){
		
		JPanel p = new JPanel();
		add(p);
		
		JLabel lb = new JLabel("-");
		
		p.add(tf1); p.add(lb); p.add(tf2); p.add(btn);
		
		btn.addActionListener(this);
		tf1.addKeyListener(this);
		tf2.addKeyListener(this);
		
		
		setTitle("진수변환예제");
		setSize(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus();
	}
	public static void main(String[] args) {
		new SwingJumin2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String year = "";
		String month = tf1.getText().substring(2, 4);
		String day = tf1.getText().substring(4, 6);
		if(tf2.getText().substring(0,1).equals("3") || tf2.getText().substring(0,1).equals("4"))
			year = "20" + tf1.getText().substring(0, 2);
		else if(tf2.getText().substring(0,1).equals("1") || tf2.getText().substring(0,1).equals("2"))
			year = "19" + tf1.getText().substring(0, 2);
		JOptionPane.showMessageDialog(null, "당신의 생일은 " + year + "년 " + month + "월 " + day + "일 입니다.");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar() == '\n' && e.getSource() == tf2) {
			btn.doClick();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if(tf1.getText().trim().length() == 6)
			tf2.requestFocus();
	}

}
