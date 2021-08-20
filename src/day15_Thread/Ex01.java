package day15_Thread;

class A01{
	public void run() {
		for(int i = 0; i<100;i++) {
			System.out.println("A01 : " + i);
		}
	}
}

class B01{
	public void run() {
		for(int i = 0; i<100;i++) {
			System.out.println("B01 : " + i);
		}
	}
}

public class Ex01 {
	public static void main(String[] args) {
		/*
		 Thread 
		 - 프로그램 동작시키기 위한 최소단위로 반드시 있어야한다
		 - 동작중인 프로그램을 process라고 한다.
		 - 한 번에 한가지 일밖에 처리하지 못한다
		 */
		
		A01 a = new A01();
		B01 b = new B01();
		a.run();            //thread가 하나라 a가 모두실행될때까지 b는 실행하지 않는다 
		b.run();            //a가 모두 실행됐다면 b로 넘어가서 실행한다 즉, 한번에 한가지 일만 처리한다
		
	
		
		
		

	}

}




