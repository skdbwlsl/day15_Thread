package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;


//대략 보는거라 의미만 알아두면 된다고 한다
public class Ex04 {
	public static void main(String[] args) {
		
		//기본틀
		JFrame frame = new JFrame("TEST"); //프레임 즉, 기본틀을 만든다(예를들어 집 장판이라 생각하자)
		
		//장판을 얻어온것
		Container c  = frame.getContentPane();
		
		//글씨기능 만들기
		JLabel label = new JLabel("Hello GUI");
		c.add(label);
		
		//위치 선정
		frame.setLocation(1000,200); //가로,세로
		
		
		//사이즈 선정,프레임크기
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack(); //pack은 변경사항을 조정해라,설정값 적용
		
		//폰트 설정
		Font font = new Font(null,0,32); //(글꼴, 기울임, 글씨크기)
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		//세팅한것 보여줘라 
		frame.setVisible(true);
		
		//끄는 기능
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//글 무한 반복도 가능
		for(int i =0; ; i++)
			label.setText(i+ "안녕하세요");
		//글 내용 변경
		//label.setText("안녕하세요");

	}

}
