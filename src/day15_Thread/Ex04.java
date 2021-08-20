package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;


//�뷫 ���°Ŷ� �ǹ̸� �˾Ƶθ� �ȴٰ� �Ѵ�
public class Ex04 {
	public static void main(String[] args) {
		
		//�⺻Ʋ
		JFrame frame = new JFrame("TEST"); //������ ��, �⺻Ʋ�� �����(������� �� �����̶� ��������)
		
		//������ ���°�
		Container c  = frame.getContentPane();
		
		//�۾���� �����
		JLabel label = new JLabel("Hello GUI");
		c.add(label);
		
		//��ġ ����
		frame.setLocation(1000,200); //����,����
		
		
		//������ ����,������ũ��
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack(); //pack�� ��������� �����ض�,������ ����
		
		//��Ʈ ����
		Font font = new Font(null,0,32); //(�۲�, �����, �۾�ũ��)
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		//�����Ѱ� ������� 
		frame.setVisible(true);
		
		//���� ���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//�� ���� �ݺ��� ����
		for(int i =0; ; i++)
			label.setText(i+ "�ȳ��ϼ���");
		//�� ���� ����
		//label.setText("�ȳ��ϼ���");

	}

}
