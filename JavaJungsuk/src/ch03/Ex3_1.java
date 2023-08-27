package ch03;

public class Ex3_1 {

	public static void main(String[] args) {
		double pi = 3.141592;
		System.out.println(pi); //3.141592
		System.out.println(Math.round(pi)); //3.141592
		System.out.println(pi*1000); //3141.592
		System.out.println(Math.round(pi*1000)); //3142 -> 정수 반환
		System.out.println(Math.round(pi*1000)/1000); //3
		System.out.println(Math.round(pi*1000)/1000.0);  // 3.142
		System.out.println((double)Math.round(pi*1000)/1000);  //3.142

		// 3.141 을 출력하려면 ?
		System.out.println(pi*1000);
		System.out.println((int)(pi*1000)); // int로 형변환해서 값손실 일으킴
		System.out.println((int)(pi*1000)/1000.0); // 3.141
		
	}

}
