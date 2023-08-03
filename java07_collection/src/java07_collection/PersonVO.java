package java07_collection;

import java.util.Calendar;

public class PersonVO {
	
	//1. 필요 변수
	private int num; //부여받은 번호(캡슐화된 객체로 생성) 
	private Calendar dateTime ; // 현재날짜, 시간정보
	public PersonVO() {}
	
	//3. 클래스 생성
	public PersonVO(int num, Calendar dateTime) {
		this.num = num ;
		this.dateTime = dateTime;
	}
	
	// 2. get & set 사용 (private이기때문에)
	public int getNum() {
		return num;
	} 
	public void setNum(int num) {
		this.num = num;
	}
	
	public Calendar getDateTime() {
		return dateTime;
	}
	public void setDateTime(Calendar dateTime) {
		this.dateTime = dateTime;
	}

		
}
