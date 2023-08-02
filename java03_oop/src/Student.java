
//DTO(Data Transfer Object):  캡슐화가 되어있는 변수들의 객체 !
public class Student {
	//1명의 학생정보를 보관할 수 있는 객체 생성
	//학년(int), 이름(String), 연락처(String) , 국어(int), 영어(double), 수학(int)
	//캡슐화 된 변수
		private int grade; // 멤버변수는 초기값 0으로 자동 설정
		private String name ; //null
		private String tel; //null
		private int kor; //0
		private double eng; //0.0 
		private int math; //0
		
		public Student() {}
		
		public Student(int grade, String name, String tel, int kor, double eng, int math){
						//new student(2, "홍길동", "010-1234-1234", 60, 25.3, 50);
			this.grade = grade;
			this.name = name;
			this.tel = tel;
			this.kor= kor;
			this.eng = eng;
			this.math = math;
			
		}
		
		
		//오버라이딩 된 toString(){} : Object의  public String toStirng() 을 오버라이딩 함
		public String toString() {
			return "grade = " + grade + "," + "name =" + name + "," + "tel ="+ tel + "," + "kor =" + kor+ "," + "eng ="+ eng +"math =" + math;
		}							 
		
		
		
	//클래스 외부로 값을 내보내는 메소드 (기존값 밖으로 전달) : gettter()
		//1. grade getter & setter 
		public int getGrade () { // getter() : 데이터형 +  get + 변수 앞글자 대분자 !
			return grade;// 기능 구현도 가능 
		}
	//클래스 외부에서 값을 변경할 수 있는 메소드 : setter()
		public void setGrade(int grade) {// return 값 없음(void) 변수 앞글자 대분자 !
			this.grade = grade;
		}
		//2. name getter & setter 
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		//3. tel getter & setter
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		//4. kor getter & setter
		public int getKor() {
			return kor ;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		//5. eng getter & setter
		public double getEng() {
			return eng;
		}
		public void setEng(double eng) {
			this.eng = eng;
		}
		//6. math getter & setter
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
			this.math = math;
		}
		
		
}
