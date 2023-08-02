
public class SingletonTest {

	//static 멤버변수(하나만 만들어짐) 을 이용하여 객체를 중복 생성하도록 한다.
	private static SingletonTest single  = null;
	
	//접근제한자 : public > protected > default> private
	//protected SingletonTest() { 패키지가 다를때는 상속
	//private 접근 제한자를 이용하여 외부에서 객체 생성불가로 만들기
	private SingletonTest() {
	}	
		//객체를 생성하여 리턴해주는 메소드 : getInstance(); -> Singleton 클래스 안에 있는 메소드를 사용하고 싶을 경우 !
	public static SingletonTest getInstance(){ // 싱글톤 기본 폼 : 객체 안만들고 접근해야 하기 때문에 static
		//외부 호출 못하는 것을 '캡슐화'
		//객체가 없을때 객체 생성하기
		if(single == null) {
			single = new SingletonTest();// 객체 생성(객체 없으면 생성 or 있으면 패스)
			}
			return single;
			
	} 
		
	}

	
	
	
