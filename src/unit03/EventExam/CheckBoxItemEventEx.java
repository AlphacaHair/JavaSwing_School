package unit03.EventExam;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame implements ItemListener {

	JCheckBox apple = new JCheckBox("사과");
	JCheckBox pear = new JCheckBox("배");
	JCheckBox cherry = new JCheckBox("체리");
	JLabel lb_result = new JLabel("현재 0원 입니다.");
	int price = 0;
	
	CheckBoxItemEventEx(){
		
		JLabel lb = new JLabel("사과 100원, 배 500원, 체리 2000원");
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		add(p);
		
		p.add(lb);
		p.add(apple);
		p.add(pear);
		p.add(cherry);
		p.add(lb_result);
		
		apple.addItemListener(this);
		pear.addItemListener(this);
		cherry.addItemListener(this);
		
		setTitle("체크 박스 - 가격을 합산하는 프로그램");
		setSize(250, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		//체크박스가 선택된 경우
		if(e.getStateChange() == ItemEvent.SELECTED) {
			if(e.getItem() == apple)
				price += 100;
			else if(e.getItem() == pear)
				price += 500;
			else if(e.getItem() == cherry)
				price += 2000;
		}//체크박스가 선택 해제된 경우
		else if(e.getStateChange() == ItemEvent.DESELECTED) {
			if(e.getItem() == apple)
				price -= 100;
			else if(e.getItem() == pear)
				price -= 500;
			else if(e.getItem() == cherry)
				price -= 2000;
		}
		lb_result.setText("현재 " + price + "원입니다.");
	}
}


