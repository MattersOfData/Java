package java07_collection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

// 컬렉션을 사용해서, 입력받은 게임수 만큼 게임 만들어 출력
//랜덤 번호 생성 (보너스 번호는 맨 마지막에 생성된 번호로)
// 6개 번호 + 1개 보너스 번호 -> size가 7개 되면 난수 생성 중단
// 중복데이터 제거 &  오름차순 정렬 필요 


public class Lotto {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		do {
			//게임수 
		
			System.out.println("게임의 수 = ");
			int cnt = scan.nextInt();
			
			//입력 받은 게임 수 만큼 게임을 만들어 출력
			
			//1. 게임의 수 출력
			for(int i = 1; i<=cnt; i++) {

			TreeSet<Integer> lotto = new TreeSet<Integer>();// 번호 저장할 객체, 중복제거, 정렬 기능
			int ran; 	//여기서 ran 은 마지막 번호가 담겨있을 수밖이 없음-> 보너스 번호로 사용 !
			while(true) { // 게임의 수 제한 없음 -> while 사용!
				ran = random.nextInt(45-1+1)+1; // 1-45사이의 난수 생성
				lotto.add(ran);
					if (lotto.size() >=7){// 번호 7개가 있으면 반복문 중지  
					break;
					}
				}
			// lotto 컬렉션에서 ran(보너스 번호/마지막번호) 제거 
			lotto.remove(ran);
			
			//출력
			System.out.print(i + "게임 =");
			System.out.print(lotto.toString());// 6개 번호 번호
			System.out.println(", 보너스 = " + ran); // 보너스 번호
			
			
			}
			
			
			 //게속 여부 확인
			System.out.print("계속하시겠습니다(1:예, 2: 아니오)?");
			int status = scan.nextInt()
;
			if(status ==2 ) {
				break;
			}
		}while(true);
			


	}
}