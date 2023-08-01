
public class B extends A{//B클래스는 A클래스를 상속받음
	//멤버변수
	String book = "HTML";
	
	//생성자메소드
	public B() {
			
	//상위 클래스의 생성자중에 매개변수가 있는 생성자를 실행할 경우
	//super 키워드를 이용하여 상위클래스의 생성자를 호출해줌.
	//메소들 중에 첫번째 실행을 하고 싶은 실행문을 표기해야 한다.
	//this() : 같은 클래스의 다른 생성자 호출
	//super() : 상위 클래스의 다른 생성자 호출
		
		super("사과"); // 원래는 첫번쨰 메소드(public A ())가 실행되야하지만, 'super'을 입력해서 두번째 메소드 실행(public A(String food))(첫번쨰꺼는 실행x)
		System.out.println("B클래스의 생성자 메소드 실행됨.");
		
		//상위클래스와 하위클래스에서 같은 필드명일때, 현재 클래스의 변수 우선 !(자바대신 -> HTML)
		//if 자바를 표현하고 싶다면 book 앞에 'super'입력 ! -> super.멤버변수는 상위 클래스의 변수
		System.out.println(isbn + "=====" + book); //123456=====HTML
		System.out.println(isbn + "=====" + super.book); //123456=====자바
		
		//현재 클래스(B클래스)에 없는 변수는(isbn) -> this를 표기하더라도, 상위클래스(A클래스)의 isbn을 접근
		//상위클래스는 하위클래스의 어떤 기능도 사용할 수 없다.
		System.out.println(isbn + "=====" + isbn);
		//System.out.println(this.isbn + "=====" + isbn);
		
		//상위클래스 변수, 메소드는 private 접근 제한자 일떄 상속하지 않음
		//System.out.println("author" + author)// private 접근제한자로 있기 때문에 사용 x
		
		//상위 클래스 메소드 호출 -> but, B클래스에 같은 변수 데이터 있다면, B클래스에 있는 데이터 사용
		method1(); //123456 ----HTML
		
		// 자신의 클래스 안에 있는 메소드 호출
		inherTest(10); //1 ~ 10 까지의 합은 55
	
		//A 클래스에서 private이라서 sum() 메소드는 상속안됨.
		//sum();
		
		
		
		sum(10); // B 클래스에 있는 메소드 sum(int max) 호출
		super.sum(10); // A클래스에 있는 메소드 sum(int max) 호출
		}	
	
		//메소드
		public void inherTest(int max) {
			int tot = 0;
			for(int i = 1 ; i<=max; i++) {
				tot += i;
			}
			System.out.println("1 ~ " + max + " 까지의 합은 " + tot);
		}
		//오버라디잉(override) : 상위클래스의 메소드를 하위클래스에서 재정의(메소드명은 같지만 다시 재정의함)
		//					: 상위클래스에서 상속받긴 하였는데, 다른 기능으로 쓰고 싶은 경우
		//					:  sum() -> sum (int max)
		
		public void method1() {
			System.out.println(isbn + " ----" + book); //123456 ----HTML
			
			}
		
		//public > protected > default > private
		//메로드 오버라이딩시,
		//접근제한자는 상위클래스이ㅡ 접근제한자보다 사용범위가 적어지면 안됨(단, 넓은 범위는 가능)
		// ex) public -> default 로 사용 불가 / default -> public 으로는 가능 !
		public void sum(int max) {
			int tot = 0;
			for(int i= 1; i<=max ; i+=2) {
				tot += i;
			}
			System.out.println("1~" + max + "까지의 짝수의 합은 " + tot + "from B");
			}
		
		
		
	}
