package test_1004;

public class Ex13_1 {

	public static void main(String[] args) {
		ThreadEx_1 t1 = new ThreadEx_1 (); 
		
		Runnable r = new ThreadEx_2();
		Thread t2 = new Thread(r);// 생성자 Thread(Runnable target)
		
		t1.start();
		t2.start();

	}

}

//1. Thread클래스를 상속해서 쓰레드를 구현
class ThreadEx_1 extends Thread { 
	public void run() { // 쓰레드가 수행할 작업을 작성
		for(int i = 0 ; i < 5; i++) {
			System.out.println(this.getName());// 조상인 Thread의 getName() 호출
											   // 상속할 경우, this.getName()사용하면 됨
											   // 즉, Thread의 이름 가져오기
		}
	}
}

// 2. Runnable 인터페이스를 구현해서 쓰레드를 구현
class ThreadEx_2 implements Runnable{
	public void run() {
		for(int i = 0 ; i<5 ; i++) {
			//Thread.currentThread(); // 현재 실행중인 쓰레드를 반환
			System.out.println(Thread.currentThread().getName());// 인터페이스로 구현할 경우, 
																 // Thread.currentThread() 하고, getName()해야 함
		}
	}
}
