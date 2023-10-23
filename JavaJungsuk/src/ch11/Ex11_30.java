package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_30 {
// ID와 PW를 키와 값의 쌍으로 저장후, 입력된 ID를 키로 HashMap에서 검색해서 얻은 PW를 입력된 PW와 비교 하는 HashMap 예제  
	
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		System.out.println(map); // {myId=1234, asdf=1111}
		map.put("asdf", "1234"); // 키가 같을경우, 마지막 값으로 덮어씀
		System.out.println(map); // {myId=1234, asdf=1234}
		 
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 pw를 입력해주세요");
			System.out.println("id :");
			String id = s.nextLine().trim(); // " asdf   " -> "asdf" : 앞뒤 공백 제거
			
			System.out.println("pw :");
			String password = s.nextLine().trim(); // " 1234   " -> "1234" : 앞뒤 공백 제거
			System.out.println();
			
			if(!(map.containsKey(id))) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
				continue; // while로 되돌아감
			}
			
			if(!(map.get(id).equals(password))) { // map.get(id) = "1234"
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
			}else {
				System.out.println("id와 비밀번호가 일치합니다");
				break; // while 빠져나옴
			}
			
		}// while
	}//main

}
