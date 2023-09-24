package test_0918;

public class Ex6_5 {

	public static void main(String args[]) {
		Student5 s = new Student5("홍길동 ",1,1,100,60,76); //이름, 반, 번호, 과목별 성적을 매개변수로 받는 생성자 필요 !
		System.out.println(s.info()); // 학생 정보 출력 메서드 필요 !
		}
	}
		
	class Student5 {
			String name;
			int ban;
			int no;
			int kor;
			int eng;
			int math;
			
			Student5 (){};
			Student5 (String name, int ban, int no, int kor, int eng, int math){// 매개변수있는 생성자
				this.name = name;
				this.ban = ban;
				this.no = no;
				this.kor = kor;
				this.eng = eng;
				this.math = math;
			}
			
			int getTotal() { 
				return kor + eng + math; 
			}
			float getAverage(){
				return (int)(getTotal()/3.0f *10 + 0.5f)/10f; 
						
			}
			String info() { 
				return name 
						+","+ban
						+","+no
						+","+ kor
						+","+eng
						+","+math
						+","+getTotal() // 메서드 호출시, () 포함 !!
						+","+ getAverage();  // 메서드 호출시, () 포함 !!
	
		}
	}
		


