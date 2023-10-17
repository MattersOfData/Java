package ch11;
import java.util.*;
public class Ex11_4 {

	//  ArrayList 클래스의 내부 분석
	public class MyVector implements List{
		Object[] data = null; // 객체를 담기 위한 객체배열을 선언
		int capacity = 0; // MyVector의 용량
		int size = 0; // 크기(객체가 저장되어있는)
		
	public MyVector(int capacity) {
		if(capacity<0)
			throw new IllegalArgumentException("유효하지 않은 값입니다.: " + capacity);
			// IllegarArgumentException 
			//잘못된 또는 부적절한 인수가 전달되었을 때 발생 -> 허용 가능한 또는 유효한 범위를 벗어나거나 인수가 올바른 유형이 아닌 경우에 발생
		this.capacity = capacity;
		data = new Object[capacity];
	}
	public MyVector() {
		this(10); // 크기를 지정하지 않으면 10으로 초기값 지정
	}
	
	// 최소한의 저장공간(capacity)를 확보하는 메서드
	public void ensureCapacity(int minCapacity) {
		if(minCapacity - data.length >0)
			setCapacity(minCapacity);
	}
	// 새로운 객체를 저장 : add
	public boolean add(Object obj) {
		ensureCapacity(size+1); //새로운 객체럴 저장하기 전에 저장할 공간을 확보
		data[size++] = obj;
		return true;
	}
	// 객체 읽기 : get
	public Object get(int index) {
		if(index<0 || index>=size) 
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		return data[index];
	}
	
	// 객체 삭제 : remove
	public Object remove(int index) {
		Object oldObj = null;
		if(index<0 || index>=size) 
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		oldObj = data[index];
		
		//만약, 삭제하고자 하는 객체가 마지막이 아니라면, 
		//1. 배열 복사를 통해서 빈자리 채워줘야 함
		if(index != size-1) {
			System.arraycopy(data, index+1, data, index, size-index-1); 
			// data[index+1]에서 data[index]로 size-index-1의 데이터를 복사
		}
		//2. 데이터가 모두 한칸씩 위로 이동 -> 마지막데이터를 null 로 함(배열은 0부터 시작하므로 마지막 요소는 index 가 size-1)
		data[size-1] = null;
		//3. 데이터가 삭제되어 데이터개수가 줄었음으로, size 값 -1 감소
		size--;
		return oldObj;
	}
	
	// 객체 삭제 : remove
	public boolean remove(Object obj) {
		for(int i= 0; i<size; i++) {
			if(obj.equals(data[i])){
				remove(i); //인덱스 i의 요소를 제거
				return true;
			}
		}
		return false;
	}
	
	// trimTosize
	public void trimTosize() {
		setCapacity(size);
	}
	
	private void setCapacity(int capacity) {
		if(this.capacity == capacity) return; // 크기가 같으면 크기 변경 X
		
		Object[] tmp = new Object[capacity];
		System.arraycopy(data, 0, tmp, 0, size);
		data = tmp;
		this.capacity = capacity;
	}
	public void clear() {
		for(int i= 0; i<size; i++) {
			data[i] = null;
			size = 0;
		}
	}
	public Object[] toArray() {
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		return result;
	}
	
	public boolean isEmpty() {return size == 0;}
	public int capacity() {return capacity;}
	public int size() {return size;}
	
//******** List인터페이스로부터 상속받은 메서드들 **********
// 인터페이스를 구현할때, 인터페이스에 정의된 모든 메서드를 구현해야 하지만(아닌 경우는 추상클래스로 선언해야 함)
// but, JDK1.8부터 List인터페이스에 3개의 디폴트 메서드가 추가되었으며, 이들은 구현하지 않아도 됨
	//	default void sort(Comparator c) {내용생략 }, JDK1.8부터
	//	default Spliterator spliterator()  {내용생략 }, JDK1.8부터
	//	default void replaceAll(UnaryOperator operator) {내용생략 },JDK1.8부터
	
//  public int size();
//  public boolean isEmpty();
	public boolean contains(Object o){ return false;}
	public Iterator iterator(){ return null; }
//	public Object[] toArray();
	public Object[] toArray(Object a[]){ return null;}
//  public boolean add(Object o);
//  public boolean remove(Object o);
	public boolean containsAll(Collection c){ return false; }
	public boolean addAll(Collection c){ return false; }
	public boolean addAll(int index, Collection c){ return false; }
	public boolean removeAll(Collection c){ return false; }
	public boolean retainAll(Collection c){ return false; }
//	public void clear();
	public boolean equals(Object o){ return false; }
//	public int hashCode();
//  public Object get(int index);
	public Object set(int index, Object element){ return null;}
	public void add(int index, Object element){}
//  public Object remove(int index);
	public int indexOf(Object o){ return -1;}
	public int lastIndexOf(Object o){ return -1;}
	public ListIterator listIterator(){ return null; }
	public ListIterator listIterator(int index){ return null; }
	public List subList(int fromIndex, int toIndex){ return null; }


	
	} // MyVector
}
	

