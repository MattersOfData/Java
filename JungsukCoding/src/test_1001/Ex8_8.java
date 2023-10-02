package test_1001;

import java.util.Scanner;

public class Ex8_8 {


	public static void main(String[] args) {
		int answer = (int)(Math.random()*100) +1;
		int input = 0; // 사용자입력 저장할 공간
		int count = 0; // 시도횟수를 세기 위한 변수
	
	
		
		do {
		count++;
		System.out.println("1과 100사이의 값을 입력하세요 :");
		try {// 사용자로부터 값을 입력받는 부분에서 유효성검사 진행 ! 
			input = new Scanner(System.in).nextInt();
		}catch (Exception e) {
			System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
			continue;
		}
			if(answer> input) {
				System.out.println("더 큰수를 입력하세요.");
			}else if(answer<input) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("맞췄습니다");
				System.out.println("시도횟수는 " + count + " 번 입니다.");
				break;
				}
			
			} while(true);  
		}
		
	} 
	

