package test_0918;

public class Ex6_4 {

	public static void main(String args[]) {
		Student s = new Student(); // 매개변수 없는 생성자(기본 생성자) --> 메서드 생성시 참고 !
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름 :"+s.name); //이름
		System.out.println("총점 :"+s.getTotal()); // 메서드 호출시, 메서드명() -> '()' 없을경우, 변수와 차이 X
		System.out.println("평균 :"+s.getAverage()); //평균
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
				return (int)(getTotal()/3.0f *10 + 0.5f)/10f; // 실수 표현시, 반드시 'f' 붙이기 !
														      // 소수점 둘째자리에서 반올림 방법
															  // 1. 반올림전숫자 *10 구해준 후, 수동으로 0.5 더함(반올림)
															  // int형 변환후, 마지막으로 10으로 나눠줌
		}
	}
		


