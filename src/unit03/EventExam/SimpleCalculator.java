package unit03.EventExam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {

	JTextField input = new JTextField(10);
	JTextField output = new JTextField(10);
	
	JLabel inLb = new JLabel("계산");
	JLabel outLb = new JLabel("결과");
	
	JButton [] calculate = new JButton[16];
	String [] names = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "CE", "계산", "+", "-", "X", "/"};
	
	SimpleCalculator() {
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(0, 4, 5, 5));
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		
		p1.add(inLb);
		p1.add(input);
		p1.add(outLb);
		p1.add(output);
		
		for(int i=0; i<calculate.length; i++) {
			calculate[i] = new JButton(names[i]);
			p2.add(calculate[i]);
			calculate[i].addActionListener(this);
		}
		
		setTitle("간단한 계산기");
		setSize(350, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SimpleCalculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int num1;
		int num2;
		int locate = 0;
//		String answer;
		if(e.getActionCommand() == "CE") {
			input.setText("");
			output.setText("");
			num1 = 0;
			num2 = 0;
			locate = 0;
		}
		else if(e.getActionCommand() == "계산") {

			String str = input.getText();
			for(int i=0; i < str.length(); i++) {
				if(str.charAt(i) == '+' ||str.charAt(i) == '-' || str.charAt(i) == 'X' || str.charAt(i) == '/')
					locate = i;
			}
			num1 = Integer.parseInt(str.substring(0, locate));
			num2 = Integer.parseInt(str.substring(locate+1));
			
			/*if(str.charAt(locate) == '+')
				answer = Integer.toString(num1 + num2);
			else if(str.charAt(locate) == '-')
				answer = Integer.toString(num1 - num2);
			else if(str.charAt(locate) == 'X')
				answer = Integer.toString(num1 * num2);
			else
				answer = Integer.toString(num1 / num2);
			output.setText(answer);*/
			
			switch(str.charAt(locate)) {
			case '+': output.setText(Integer.toString(num1 + num2)); break;
			case '-': output.setText(Integer.toString(num1 - num2)); break;
			case 'X': output.setText(Integer.toString(num1 * num2)); break;
			case '/': output.setText(Integer.toString(num1 / num2)); break;
			}
		}
		else {
			input.setText(input.getText()+e.getActionCommand());
		}
	}
}