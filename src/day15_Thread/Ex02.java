package day15_Thread;

class A02 extends Thread{
	public void run() {
		for(int i = 0; i<100;i++) {
			System.out.println("A02 : " + i);
		}
	}
}

class B02 extends Thread{
	public void run() {
		for(int i = 0; i<100;i++) {
			System.out.println("B02 : " + i);
		}
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		A02 a = new A02();
		B02 b = new B02();
		
		//종료하겠다는 의미 즉, 메인 종료하니 종속돼있는 thread도 종료해라
		a.setDaemon(true);
		b.setDaemon(true);
		
		a.start();
		b.start();
		
		System.out.println("프로그램 종료합니다");
		System.out.println("프로그램 종료합니다");
		System.out.println("프로그램 종료합니다");
}
}