package unit03.EventExam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SwingCoffee extends JFrame implements ItemListener {

	JRadioButton ame = new JRadioButton("아메리카노");
	JRadioButton latte = new JRadioButton("라떼");
	JRadioButton capu = new JRadioButton("카푸치노");
	JTextArea ta = new JTextArea(7, 20);
	JScrollPane sp = new JScrollPane(ta);
	
	SwingCoffee(){
		
		JPanel p = new JPanel();
		add(p, BorderLayout.NORTH);
		
		ButtonGroup rg = new ButtonGroup();
		rg.add(ame);
		rg.add(latte);
		rg.add(capu);
		
		p.add(ame);
		p.add(latte);
		p.add(capu);
		add(sp, BorderLayout.CENTER);
		
		ame.addItemListener(this);
		latte.addItemListener(this);
		capu.addItemListener(this);
		
		setTitle("커피주문");
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SwingCoffee();

	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			ta.append(((AbstractButton)e.getItem()).getText()+ "가 선택되었습니다\n");
		}
		else if(e.getStateChange() == ItemEvent.DESELECTED) {
			ta.append(((AbstractButton)e.getItem()).getText()+ "가 해제되었습니다\n");
		}
	}

}
