package java09_thread;

// Thread 처리를 하는 클래스 만드는 방법 1
// Treahd 클래스를 상속받아
// 스레드구현하는 코드를 run() 메소드에 오버라이딩을 한다
// start()를 호출해준다.

public class ThreadTest01 extends Thread{
	int num = 1;
	String name;
	
	public ThreadTest01() {}
	
	public ThreadTest01(String name) {
		this.name = name;
	}
	
	public void run() {
		while(true) {
			System.out.println(name + "--- >"  + num++);		
		}
	}
		
	public static void main(String[] args) {
		ThreadTest01 tt1 =new ThreadTest01("첫번쨰 스레드");
		ThreadTest01 tt2 =new ThreadTest01("두번쨰 스레드");
		
		tt1.start(); // 스레드의 시작
		tt2.start(); // 실행안됨

	}

}


// 원래 코드
//public class ThreadTest01 extends Thread{
//	int num = 1;
//	String name;
//	
//	public ThreadTest01() {}
//	
//	public ThreadTest01(String name) {
//		this.name = name;
//	}
//	public void numOutput() {
//		while(true) {
//			System.out.println(name + "--- >"  + num++);		
//		}
//	}
//		
//	public static void main(String[] args) {
//		ThreadTest01 tt1 =new ThreadTest01("첫번쨰 스레드");
//		ThreadTest01 tt2 =new ThreadTest01("두번쨰 스레드");
//		
//		tt1.start(); // 스레드의 시작
//		tt2.start(); // 실행안됨
//
//	}
//
//}
