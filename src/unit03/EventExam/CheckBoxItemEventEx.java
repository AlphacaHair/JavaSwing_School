package unit03.EventExam;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame implements ItemListener {

	JCheckBox [] fruit = new JCheckBox[3];
	String [] names = {"사과", "배", "체리"};
	
	JLabel lb_result = new JLabel("현재 0원 입니다.");
	int price = 0;
	
	CheckBoxItemEventEx(){
		
		JLabel lb = new JLabel("사과 100원, 배 500원, 체리 2000원");
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		add(p);
		
		p.add(lb);
		for(int i=0; i<fruit.length; i++) {
			fruit[i] = new JCheckBox(names[i]);
			p.add(fruit[i]);
			fruit[i].addItemListener(this);
		}
		p.add(lb_result);
		
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
			if(e.getItem() == fruit[0])
				price += 100;
			else if(e.getItem() == fruit[1])
				price += 500;
			else if(e.getItem() == fruit[2])
				price += 2000;
		}//체크박스가 선택 해제된 경우
		else if(e.getStateChange() == ItemEvent.DESELECTED) {
			if(e.getItem() == fruit[0])
				price -= 100;
			else if(e.getItem() == fruit[1])
				price -= 500;
			else if(e.getItem() == fruit[2])
				price -= 2000;
		}
		lb_result.setText("현재 " + price + "원입니다.");
	}
}