package unit03.EventExam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingLogin2 extends JFrame implements  ActionListener {

	JTextField tfId = new JTextField();
	JPasswordField tfPwd = new JPasswordField();
	
	JButton btnLogin = new JButton("로그인");
	JButton btnCancel = new JButton("취소");
	
	JLabel lbResult = new JLabel("결과 출력", JLabel.LEFT);
	
	SwingLogin2(){
		
		setLayout(new BorderLayout());
		
		//북쪽 레이아웃
		ImageIcon logo = new ImageIcon("img/robot.PNG");
		JLabel lbLogo = new JLabel(logo);
		add(lbLogo, BorderLayout.NORTH);
		
		//센터 레이아웃
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0, 2));
		
		JLabel lbId = new JLabel("아 이 디", JLabel.CENTER);
		JLabel lbPwd = new JLabel("비밀번호", JLabel.CENTER);
		
		p.add(lbId);
		p.add(tfId);
		p.add(lbPwd);
		p.add(tfPwd);
		p.add(btnLogin);
		p.add(btnCancel);
		
		btnLogin.setBackground(Color.yellow);
		btnCancel.setBackground(Color.gray);
		
		add(p, BorderLayout.CENTER);
		
		//남쪽 레이아웃
		add(lbResult, BorderLayout.SOUTH);
		
		//이벤트 달기
		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);
		
		//프레임 기본 세팅
		setTitle("로그인");
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
				lbResult.setText("아이디를 입력하세요.");
			else if(strpwd.length() == 0)
				lbResult.setText("비밀번호를 입력하세요.");
			else
				lbResult.setText(strid + "님의 비밀번호는 " + strpwd + "입니다.");
		}
		else if (e.getSource() == btnCancel) {
			lbResult.setText("취소하였습니다.");
			tfId.setText("");
			tfPwd.setText("");
		}
		
	}
	
	
}
