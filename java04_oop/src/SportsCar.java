import com.compus.Car;

public class SportsCar extends Car {

	public SportsCar() {
		System.out.println("브랜드 -> " + brand);	//패키지가 다른 Car에서 매개변수 사용->
												//protected 여서 가능 (or public)
		speedUp(); 	//Car와 상속 관계에 있기 때문에 메소드 사용 가능 
		System.out.println("speed->" + speed);
	}
	
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		//System.out.println("brand->" + sc.brand);
		
		//다른 패키지에 있는 Car 클래스
		Car car = new Car(); // protected 생성자는 다른 패키지일때 객체 생성 불가
							// 해당 클래스 안에 있는 기능 못쓴다는 애기		
		//car.speedUp(); protected 메소드는 상속받지 않으면 사용 불가 !(다른 패키지에 있을때)
		
	}
}
