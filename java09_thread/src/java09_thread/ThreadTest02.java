package java09_thread;


// 스레드 생성방법 1:
// 만약 쓰레드를 생성하지 않는다면 -> 첫번째 쓰레드 1~1000 이후, 두번째 1~ 1000, 세번쨰 1~ 1000 순서대로 진행 
// 인터페이스 Runnable 상속받아 스레드 구현

public class ThreadTest02 implements Runnable {
	String msg;
	
	public ThreadTest02() {
		
	}
	
	public ThreadTest02(String msg) {
		this.msg = msg; 
	}
	
	@Override // 스레드 구현이 가능한 메소드 오버라이딩
	public void run() {
		for(int i= 1; i<=1000; i++) {
			System.out.println(msg + i);
		}
	}

	public static void main(String[] args) {
		
		ThreadTest02 tt1 = new ThreadTest02("첫번째 Thread");
		ThreadTest02 tt2 = new ThreadTest02("두번째 Thread");
		ThreadTest02 tt3 = new ThreadTest02("세번째 Thread");
		
		//Thread 클래스 안에 start() 메소드 있음 
		Thread t1 = new Thread(tt1);
		Thread t2 = new Thread(tt2);
		Thread t3 = new Thread(tt3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
