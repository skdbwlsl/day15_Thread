package day15_Thread;

import java.util.Scanner;

class A03 extends Thread{
	public void run() {
		for(;;) {
			try {
			System.out.println("����� ����ɴϴ�");
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
	}
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String message = null;
		A03 a = new A03();
		a.setDaemon(true);
		a.start();
		for(;;) {
			System.out.println("���� �ż��� : ");
			message = input.next();
			System.out.println(message);
			if(message.equals("exit"))
				break;
		}
		System.out.println("���α׷� ���� �մϴ�");
		System.out.println("���α׷� ���� �մϴ�");
		System.out.println("���α׷� ���� �մϴ�");
		System.out.println("���α׷� ���� �մϴ�");

	}

}
