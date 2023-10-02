
package test_1001;

public class Ex9_3 {

		public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		int pos = fullPath.lastIndexOf("\\");
		
		if(pos!= -1) { //lastIndexOf()는 찾는 문자열이 없으면 -1을 반환
			path = fullPath.substring(0, pos); // 0 ~ pos 값 전까지
			fileName = fullPath.substring(pos+1); // pos (\\)다음부터 끝까지
		
		}
		
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
	}

}
