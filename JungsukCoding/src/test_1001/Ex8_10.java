
package test_1001;

public class Ex8_10 {

	// 실행순서
	//1. main 메서드가 실행
	//2. main 메서드에서 method1()을 호출
	//3. method1()이 실행
	//4. method1() 내에서 method2()가 호출
	//5. method2()에서 NullPointerException이 발생 but, method2()에서 catch 없어서 method1()으로 돌아감
	//6. method1() 내에서 NullPointerException을 잡는 catch (NullPointerException e) 블록이 예외를 잡아내고 "2"를 출력한 후 예외를 다시 던짐
	// ** 이미 처리된 예외가 다시 던져져 메서드가 종료됨 
	// ** 예외가 catch 블록에서 다시 던져졌기 때문에 catch 블록 이후에 있는 코드는 실행되지 않음
	//7. method1() 내에서 finally 블록이 실행되어 "4"를 출력
	//8. main 메서드에서는 catch (Exception e) 블록에서 재던진 NullPointerException 잡아내고 "7"을 출력
		
	public static void main(String[] args) throws Exception {
		try {
			method1();
			System.out.println(6);
		}catch(Exception e) {
			System.out.println(7);
			}
		}
	

	static void method1() throws Exception{
		try {
			method2();
			System.out.println(1);
			}catch (NullPointerException e) {
			System.out.println(2);
			throw e; // 해당 블록 이후 실행 안함
			}catch(Exception e) {
				System.out.println(3);
			}finally {
				System.out.println(4);
			} 
		System.out.println(5);
		}
	static void method2() {
		throw new NullPointerException();
		}	
	}
		
	

