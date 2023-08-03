package java07_collection;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class BankWaiting {

public static int count = 1; //번호를 카운트할 멤버변수
		
// 손님올때마다, 손님 정보(번호표뽑는 날짜& 시간, 부여받은 번호)을 담을 Queue 기능이 있는 컬렉션 객체 생성(LinkedList)
// 손님 정보는 각 은행마다 1개씩 존재해야 하기때문에 static 으로 생성 !
	public static LinkedList<PersonVO> waitingList = new LinkedList<PersonVO>();
	Scanner scan = new Scanner(System.in); // 메뉴 입력
	public BankWaiting() {}
	
//메뉴입력 -> 1번 or 2번 처리	
	public void bankStart() {
		while(true) {
			System.out.print("메뉴 [1. in(손님) 2. out(은행원)] ");
			String menu = scan.nextLine(); // 문자열 칠경우도 감안
			switch (menu) {
			case "1": inGuest();	break;
			case "2" :OutGuest();	break;
			default:
				System.out.println("메뉴를 잘못 선택하셨습니다");
			} 
		}
		
	}
	//번호표를 뽑을때
	public void inGuest() {
	Calendar now = Calendar.getInstance(); // Calendar 클래스는 객체 생성 x -> 메소드 getinstance( )사용!	
	
	//손님 정보가 있는 객체 생성
	PersonVO vo = new PersonVO(); 
	vo.setNum(count++); // ++뒤에 있으니까, 처음에는 1 -> 그 다음 2로 바뀜
	vo.setDateTime(now);
	
	//대기열에 추가하기
	waitingList.offer(vo);
	
	//원하는 포맷으로 
	SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm (E)"); // E = 요일
	String nowTxt = fmt.format(now.getTime());
	//Message출력
	//컬렉션 데이터 리스트의 객체 개수 = 대기인원
	System.out.println("대기인수 : " + waitingList.size() + "날짜 -->" + nowTxt + "," + "번호 : " + vo.getNum());
	
	}
	// 호출되었을때 (단, 대기인원이 없을경우 ? NoSuchElementException 로 예외 처리 )
	
	public void OutGuest() {
		try {
	// 1. 먼저 입력된 객체를 가지고 나오면,
	PersonVO vo= waitingList.pop(); //2. 먼저 입력된 객체 사라짐
	System.out.println("대기인수 : " + waitingList.size()+ " , " + "호출번호 : " + vo.getNum());
		}catch(NoSuchElementException me){ 
		System.out.println("대기자가 존재하지 않습니다.");
		}
	}
	public static void main(String[] args) {
		BankWaiting bw = new BankWaiting ();
		bw.bankStart();
	}

}

//하기와 같은 프로그램을 만들기
//실행
//메뉴 [1. in(손님) 2. out(은행원)] 
//1 입력
//대기인수 : 1 --> 2023-08-03-10:39(은행표 뽑은 현재시간), 번호: 1 

//메뉴 [1. in(손님) 2. out(은행원)] 
//1 입력
//대기인수 : 2 --> 2023-08-03-10:39(은행표 뽑은 현재시간), 번호: 2 
	
//메뉴 [1. in(손님) 2. out(은행원)] 
//2 입력
//대기인수 : 1 , 호출번호 : 1
	
//실행
//메뉴 [1. in(손님) 2. out(은행원)] 
//1 입력
//대기인수 : 1 --> 2023-08-03-10:39(은행표 뽑은 현재시간), 번호: 1 	
	