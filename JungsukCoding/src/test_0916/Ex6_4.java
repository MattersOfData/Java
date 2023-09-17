package test_0916;

public class Ex6_4 {

	public static void main(String args[]) {
		Student s = new Student(); // 매개변수 없는 생성자(기본 생성자) --> 메서드 생성시 참고 !
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println(" :"+s.name); //이름
		System.out.println(" :"+s.getTotal()); //총점
		System.out.println(" :"+s.getAverage()); //평균
			}
		}
		
	class Student {
			String name;
			int ban;
			int no;
			int kor;
			int eng;
			int math;
			
			Student (){};
			
			int getTotal() { // 매개변수 없는 메서드 생성하기 !
				return kor + eng + math; 
			}
			float getAverage(){// 매개변수 없는 메서드 생성하기 !
				return (int)(getTotal()/3.0f *10 + 0.5f)/10f; // 소수점 둘째자리에서 반올림
															  // 반올림전숫자까지 구해준 후, 수동으로 0.5 더함(반올림)
															  // int형 변환후, 마지막으로 10으로 나눠줌
		}
	}
		


