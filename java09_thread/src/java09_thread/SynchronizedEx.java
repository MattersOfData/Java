package java09_thread;

// 아들과 엄마가 같이 사용하는 통장의 출금액 & 잔액 & 인출인  표시하기
// Runnable을 상속받고 있는 클래스
public class SynchronizedEx implements Runnable {

	private int depositMoney= 10000;
	
	public SynchronizedEx() {
		
	}

	// 스레드 영역 -> 메소드에 동기화 처리 
	public synchronized void run() {
	//스레드 동기화 : 스레드를 사용중일때 다른 스레드는 대기를 하고, 현재 스레드 실행끝나면 다음스레드를 구현
	// 먼저 시작하는 스레드가 7번 끝나야-> 다음 스레드가 실행 가능 
	//synchronized (this) {
	// 총 인출은 1번에 1000원씩 7번 인출
		for(int i = 1 ; i<=7; i++) {
	//스레드 지연 시키기
		try {
			Thread.sleep(1000);// 일정시간(밀리초)동안 스레드 일시정지
		} catch (Exception e) {}
			withDraw(1000);
		}
	}	
	//}
	//인출하는 메소드
	public void withDraw(int howMuch) {

	if(depositMoney>=howMuch) { // 잔액이 있을때
		depositMoney -= howMuch ;													//현재 실행되고 있는 쓰레드의 이름
		System.out.printf(" 출금액: %d, 잔액 : %d, 인출인: %s  \n" , howMuch, depositMoney,Thread.currentThread().getName());	
		
	}else{ // 잔액이 없을때
		System.out.println("출금인: " + Thread.currentThread().getName());
		System.out.println("잔액이 부족합니다");
		
	//인출금액에 없는 경우, 멈춤 설정(현재 실행중인 스레드 중지)
		try {
			this.wait(); // 현재 실행중인 스레드 중지
		}catch (Exception e) {
			}
		}
		
	}
	
	public static void main(String[] args) {
	
		SynchronizedEx ATM =new SynchronizedEx();
		
		Thread mother = new Thread( ATM, "mother"); //엄마 : A지점에서 인출
		//아들 : B지점에서 인출
		Thread son  = new Thread(ATM, "son");
		
		mother.start();
		son.start();
			
	}

}
