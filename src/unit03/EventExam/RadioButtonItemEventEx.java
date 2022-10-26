package unit03.EventExam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonItemEventEx extends JFrame implements ItemListener {

	JTextField src = new JTextField(9);
	JTextField des = new JTextField(9);
	
	JLabel lb = new JLabel("=>", JLabel.CENTER);
	
	JRadioButton decimal = new JRadioButton("Deciaml");
	JRadioButton binary = new JRadioButton("Binary");
	JRadioButton octal = new JRadioButton("Octal");
	JRadioButton hex = new JRadioButton("Hex");
	
	JRadioButton [] convert = new JRadioButton[4];
	String [] names = {"Decimal", "Binary","Octal", "Hex"};
	
	ButtonGroup bg = new ButtonGroup();
	
	RadioButtonItemEventEx() {
		
		JPanel p = new JPanel();
		add(p);
		
		bg.add(decimal);
		bg.add(binary);
		bg.add(octal);
		bg.add(hex);
		
		p.add(src);
		p.add(lb);
		p.add(des);
		
		for(int i=0; i<convert.length; i++) {
			convert[i] = new JRadioButton(names[i]);
			bg.add(convert[i]);
			p.add(convert[i]);
			convert[i].addItemListener(this);
		}
		
		decimal.addItemListener(this);
		binary.addItemListener(this);
		octal.addItemListener(this);
		hex.addItemListener(this);
		
		setTitle("진수변환예제");
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new RadioButtonItemEventEx();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			String strSrc = src.getText().trim();
			int num = Integer.parseInt(strSrc);
			String desSrc;
			
			if(e.getItem() == convert[0]) {
				desSrc = Integer.toString(num);
				des.setText(desSrc);
			} 
			else if(e.getItem() == convert[1]) {
				desSrc = Integer.toBinaryString(num);
				des.setText(desSrc);
			}
			else if(e.getItem() == convert[2]) {
				desSrc = Integer.toOctalString(num);
				des.setText(desSrc);
			}
			else if(e.getItem() == convert[3]) {
				desSrc = Integer.toHexString(num);
				des.setText(desSrc);
			}
		}
	}

}
