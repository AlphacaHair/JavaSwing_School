package unit03.EventExam;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCounter extends JFrame implements ActionListener {

	JLabel lb = new JLabel("카운터값");
	JTextField tf = new JTextField("0", 5);
	
	JButton btnInc = new JButton("증가");
	JButton btnDec = new JButton("감소");
	JButton btnCls = new JButton("초기화");
	
	SwingCounter() {
		
		setLayout(new FlowLayout());
		
		JPanel p = new JPanel();
		add(p);
		
		p.add(lb);
		p.add(tf);
		p.add(btnInc);
		p.add(btnDec);
		p.add(btnCls);
		
		btnInc.addActionListener(this);
		btnDec.addActionListener(this);
		btnCls.addActionListener(this);
		
		//프레임 기본세팅
		setTitle("간단 카운터");
		setSize(400, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingCounter();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str;
		int num;
		
		if(e.getSource() == btnInc) {
			str = tf.getText().trim();
			num = Integer.parseInt(str)+1;
			tf.setText(Integer.toString(num));
		}
		else if(e.getSource() == btnDec) {
			
			str = tf.getText().trim();
			num = Integer.parseInt(str)-1;
			if(num < 0)
				num = 0;
			tf.setText(Integer.toString(num));
		}
		else if(e.getSource() == btnCls) {
			tf.setText("0");
		}
	}
}
