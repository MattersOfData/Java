package test_0918;
// 다음과 같은 실행결과를 얻도록 코드를 완성하시오.
// 메서드 명 : action
// 기능 : 주어진 객체의 메서드를 호출한다.
//		DanceRobot인 경우, dance()를 호출하고,
// 		SingRobot인 경우, sing()을 호출하고,
// 		DrawRobot인 경우, draw()를 호출한다
// 반환타입 : 없음
// 매개변수 : Robot r - Robot 인스턴스 또는 Robot의 자손 인스턴스


public class Ex7_18 {
	public static void action(Robot r) { 
		//action 메서드에서, 매개변수가 Robot 타입임으로 --> 자손인 DanceRobot, SingRobot, DrawRobot 타입 모두 매개변수로 가능
		
		//실제 인스턴스 타입 확인
		if(r instanceof DanceRobot) { 
			DanceRobot dr = (DanceRobot)r;
			dr.dance();
		} else if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.sing();
		} else if(r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot)r;
			dr.draw();
			}
		}

		
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		// Robot[0] = new DanceRobot();
		// Robot[1] = new SingRobot();
		// Robot[2] = new DrawRobot();
		
		
		for (int i = 0; i<arr.length; i++) 
			action(arr[i]);
			
		}
	}
class Robot{}
class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤을 춥니다");
		}
	}
class SingRobot extends Robot{
	void sing() {
		System.out.println("노래를 합니다");
		}
	}
class DrawRobot extends Robot{
	void draw() {
		System.out.println("그림을 그립니다.");
		}
	}