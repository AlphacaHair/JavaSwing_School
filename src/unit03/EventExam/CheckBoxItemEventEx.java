package unit03.EventExam;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame implements ItemListener {

	JCheckBox [] fruit = new JCheckBox[3];
	String [] names = {"���", "��", "ü��"};
	
	JLabel lb_result = new JLabel("���� 0�� �Դϴ�.");
	int price = 0;
	
	CheckBoxItemEventEx(){
		
		JLabel lb = new JLabel("��� 100��, �� 500��, ü�� 2000��");
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
		
		setTitle("üũ �ڽ� - ������ �ջ��ϴ� ���α׷�");
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
		//üũ�ڽ��� ���õ� ���
		if(e.getStateChange() == ItemEvent.SELECTED) {
			if(e.getItem() == fruit[0])
				price += 100;
			else if(e.getItem() == fruit[1])
				price += 500;
			else if(e.getItem() == fruit[2])
				price += 2000;
		}//üũ�ڽ��� ���� ������ ���
		else if(e.getStateChange() == ItemEvent.DESELECTED) {
			if(e.getItem() == fruit[0])
				price -= 100;
			else if(e.getItem() == fruit[1])
				price -= 500;
			else if(e.getItem() == fruit[2])
				price -= 2000;
		}
		lb_result.setText("���� " + price + "���Դϴ�.");
	}
}