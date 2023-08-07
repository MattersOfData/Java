package java07_collection;

//Generic이 가능한 클래스 만들기
//1글자 대문자로 표기

// K : Key
// V : Value
// E : element

public class GenericTest<K, V> { // <int , String>
	// 캡슐화된 변수
	private K num;
	private V data;
	
	public GenericTest() {
	
	}

	public GenericTest(K num, V data) {
		this.num = num;
		this.data = data;
		
		
	}
	public K getNum() {
		return num;
	}
	public void setNum(K num) {
		this.num = num;
	}
	public V getData() {
		return data;
	}
	public void setData(V data) {
		this.data = data;
	}


	
	
	
	
	
}
