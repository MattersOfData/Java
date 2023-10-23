package ch11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_19 {

	public static void main(String[] args) {
		String[] strArr = {"cat","Dog","lion","tiger"};
		
		//static void sort(Object[] a) 객체 배열에 저장된 객체가 구현한 Comparable에 의한 정렬
		//static void sort(Object[] a, Comparator c) // 지정한 Comparator에 의한 정렬
		
		//Arrays.sort(정렬대상, 정렬기준) = (Object[] a, Comparator c)
		Arrays.sort(strArr); // String의 comparable구현에 의한 정렬 -> 대문자 vs 소문자일경우, 대문자가 먼저 나열
							 // String클래스 자체에서 가지고 있는 기본정렬기준으로 정렬진행(사전순)
							 // 사전순 : 공백>숫자>대문자>소문자 
							 // class String implements Comparable , int CompareTo() {} 
		System.out.println("strArr="+ Arrays.toString(strArr)); //strArr=[Dog, cat, lion, tiger]
		
		Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER); // 대소문자 구별 안함(f2눌러서 설명볼 수 있음)
		System.out.println("strArr="+ Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending()); // 역순정렬을 하기 위해, Descending 클래스 생성 --> '비교기준' 받아옴
		System.out.println("strArr="+ Arrays.toString(strArr));

		}
	}// end of Ex11_19

	class Descending implements Comparator{ // Descending의 정렬기준 생성 -> Comparator 구현해야 함
		public int compare(Object o1, Object o2) {
			if( o1 instanceof Comparable && o2 instanceof Comparable) { // 매개변수타입이 Object이기때문에, compareto()바로 호출 x
																		// --> 먼저 형변환해야함!
				Comparable c1 = (Comparable) o1;
				Comparable c2 = (Comparable) o2;
				return c1.compareTo(c2) * -1; //-1을 곱해서, 기본 정렬방식의 역으로 변경
				//return c2.compareTo(c1) * -1;
				
			}return -1;
		}

	}// end of Comparator

