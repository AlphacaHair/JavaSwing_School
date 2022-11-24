package unit03.ExamPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingExam11 extends JFrame implements ItemListener, ActionListener  {

	JCheckBox menu1 = new JCheckBox("떡볶이");
	JCheckBox menu2 = new JCheckBox("순대");
	JCheckBox menu3 = new JCheckBox("어묵");
	
	JLabel lb_result = new JLabel("현재 0원입니다.", JLabel.CENTER);
	
	JRadioButton pay1 = new JRadioButton("현금");
	JRadioButton pay2 = new JRadioButton("카드");
	
	ButtonGroup bg = new ButtonGroup();
	
	JButton btn1 = new JButton("결제");
	JButton btn2 = new JButton("종료");
	
	SwingExam11(){
		
		setLayout(new GridLayout(0, 1));
		
		JLabel lb = new JLabel("떡볶이 2000원, 순대 3000원, 어묵 500원", JLabel.CENTER);
		add(lb);
	
		JPanel p1 = new JPanel();
		add(p1);
		
		p1.add(menu1);
		p1.add(menu2);
		p1.add(menu3);
		
		menu1.addItemListener(this);
		menu2.addItemListener(this);
		menu3.addItemListener(this);
		
		add(lb_result);
		
		JPanel p2 = new JPanel();
		add(p2);
		
		p2.add(pay1);
		p2.add(pay2);
		
		JPanel p3 = new JPanel();
		add(p3);
		
		bg.add(pay1);
		bg.add(pay2);
		
		p3.add(btn1);
		p3.add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		setTitle("수행평가1");
		setSize(250, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args){
		new SwingExam11();
	}

	int sum = 0;
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			if(e.getItem() == menu1)
				sum += 2000;
			else if(e.getItem() == menu2)
				sum += 3000;
			else if(e.getItem() == menu3)
				sum += 500;
		}
		else if(e.getStateChange() == ItemEvent.DESELECTED) {
			if(e.getItem() == menu1)
				sum -= 2000;
			else if(e.getItem() == menu2)
				sum -= 3000;
			else if(e.getItem() == menu3)
				sum -= 500;
		}
		lb_result.setText("현재 " + sum + "원 입니다.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			if(pay1.isSelected())
				JOptionPane.showMessageDialog(null, "현금으로 " + sum + "원 결제합니다.");
			else if(pay2.isSelected())
				JOptionPane.showMessageDialog(null, "카드로 " + sum + "원 결제합니다.");
		}
	}

}
