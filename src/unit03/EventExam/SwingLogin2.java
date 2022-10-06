package unit03.EventExam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingLogin2 extends JFrame implements  ActionListener {

	JTextField tfId = new JTextField();
	JPasswordField tfPwd = new JPasswordField();
	
	JButton btnLogin = new JButton("�α���");
	JButton btnCancel = new JButton("���");
	
	JLabel lbResult = new JLabel("��� ���", JLabel.LEFT);
	
	SwingLogin2(){
		
		setLayout(new BorderLayout());
		
		//���� ���̾ƿ�
		ImageIcon logo = new ImageIcon("img/robot.PNG");
		JLabel lbLogo = new JLabel(logo);
		add(lbLogo, BorderLayout.NORTH);
		
		//���� ���̾ƿ�
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0, 2));
		
		JLabel lbId = new JLabel("�� �� ��", JLabel.CENTER);
		JLabel lbPwd = new JLabel("��й�ȣ", JLabel.CENTER);
		
		p.add(lbId);
		p.add(tfId);
		p.add(lbPwd);
		p.add(tfPwd);
		p.add(btnLogin);
		p.add(btnCancel);
		
		btnLogin.setBackground(Color.yellow);
		btnCancel.setBackground(Color.gray);
		
		add(p, BorderLayout.CENTER);
		
		//���� ���̾ƿ�
		add(lbResult, BorderLayout.SOUTH);
		
		//�̺�Ʈ �ޱ�
		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);
		
		//������ �⺻ ����
		setTitle("�α���");
		setSize(300, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new SwingLogin2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnLogin)	{
			String strid = tfId.getText();
			String strpwd = new String(tfPwd.getPassword());
			
			if(strid.length() == 0)
				lbResult.setText("���̵� �Է��ϼ���.");
			else if(strpwd.length() == 0)
				lbResult.setText("��й�ȣ�� �Է��ϼ���.");
			else
				lbResult.setText(strid + "���� ��й�ȣ�� " + strpwd + "�Դϴ�.");
		}
		else if (e.getSource() == btnCancel) {
			lbResult.setText("����Ͽ����ϴ�.");
			tfId.setText("");
			tfPwd.setText("");
		}
		
	}
	
	
}
