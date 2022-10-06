package unit03.EventExam;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame implements ItemListener {

	JCheckBox apple = new JCheckBox("���");
	JCheckBox pear = new JCheckBox("��");
	JCheckBox cherry = new JCheckBox("ü��");
	JLabel lb_result = new JLabel("���� 0�� �Դϴ�.");
	int price = 0;
	
	CheckBoxItemEventEx(){
		
		JLabel lb = new JLabel("��� 100��, �� 500��, ü�� 2000��");
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
			if(e.getItem() == apple)
				price += 100;
			else if(e.getItem() == pear)
				price += 500;
			else if(e.getItem() == cherry)
				price += 2000;
		}//üũ�ڽ��� ���� ������ ���
		else if(e.getStateChange() == ItemEvent.DESELECTED) {
			if(e.getItem() == apple)
				price -= 100;
			else if(e.getItem() == pear)
				price -= 500;
			else if(e.getItem() == cherry)
				price -= 2000;
		}
		lb_result.setText("���� " + price + "���Դϴ�.");
	}
}


