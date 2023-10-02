package test_1001;

public class Ex8_9 {


	public static void main(String[] args) throws Exception {
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);

		}
	}
	class UnsupportedFuctionException extends RuntimeException{
		private final int ERR_CODE;
		
		UnsupportedFuctionException(String msg , int errCode ){ // 생성자 
		super(msg); // RuntimeException(String msg) 조상의 생성자 를 호출 , 부모 클래스의 생성자를 호출하여 예외 메시지를 설정
		// 여기서, 에러메시지를 저장하는 인스턴스변수 msg 는 상속받은 것이므로 조상의 생성자를 호출해서 초기화되도록 해야 함
		ERR_CODE = errCode;
		}
		
		UnsupportedFuctionException(String msg) {
			this(msg, 100); // Err_code를 100(기본값)으로 초기화
		}
		
		public int getErrorCode(){
			return ERR_CODE;
		}
		
		@Override
		public String getMessage() { // Exception의 getMessage() 오버라이딩 
									 // 예외 객체가 생성될 때 예외 메시지를 저장하고(사용자지정 가능) 나중에 이 메시지를 반환하는 역할 
			return "[" + getErrorCode() + "]" + super.getMessage(); 
		}
	}
		
	

