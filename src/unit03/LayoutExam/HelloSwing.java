package unit03.LayoutExam;

import javax.swing.*;

//2. JFrame 상속받기
public class HelloSwing extends JFrame {

	//생성자에서 화면 만들기
	HelloSwing(){
		
		//초기세팅해주기
		setTitle("안녕 스윙!");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //나갔을때도 창이 메모리에 남아있는 경우 존재, 그걸 방지하는 명령어
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		//1. new 생성자()로 윈도우 프로그램 실행시키기
		new HelloSwing();
		
	}
}
