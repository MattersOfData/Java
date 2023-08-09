package java10_io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public FileTest() {
		//File : 드라이브, 폴더 파일명으로 객체를 생성하여 파일처리를 할 수 있는 클래스
		
		File f1 = new File("C://javaFileTest"); // 폴더명만 , C자체에서는 보안상으로 생성 못함 
		File f2 = new File("C://javaFileTest/sql04_.dml.sql"); // 폴더명 + 파일명
		File f3 = new File(f1, "test.txt"); // 폴더명과 파일명 분리 (실제 없는 파일)
		
		// 폴더 생성하기
		File f4 = new File("C://newFolder"); // 현재 해당 경로에 파일 없음
		if(!f4.exists()) { // 폴더 존재 유무 확인 : true -> 폴더가 있음 / false -> 폴더가 없음
			if(f4.mkdir()) { // 한개 폴더 생성 : mkdir -> 하위폴더 있는경우 : mkdirs
		System.out.println("폴더가 생성됨");
		}else {
			System.out.println("폴더 생성실패");
		}
					
	}
		try {
		//파일생성하기 -> 설명에 IOException 필요하다고 해서 추가해줌
			if(!f3.exists()) {
				if(f3.createNewFile()) {
					System.out.println("파일이 생성됨");
				}else {
					System.out.println("파일 생성실패");
				}
			}
		
		
		//마지막 수정일
		long lastDate = f2.lastModified(); // 날짜와 시간을 밀리초로 표시 (1970년 1월 1일 0시 0분 0초 기준)
		
		Calendar now =Calendar.getInstance(); // 현재
		now.setTimeInMillis(lastDate);
		
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		String lastModified = fmt.format(now.getTime()); // 
		System.out.println("마지막 수정일은 = " + lastModified);
		
		//특정 드라이브의 폴더, 파일목록을 구하기//
		File f5 = new File("C://");
		File[] list = f5.listFiles(); // f5에 있는 파일들(배열)이 나옴
		
		// getPath() : 경로 + 파일명 구하기
		// getName() : 파일명만 구하기
		// getApsolutePath() : 경로 + 파일명 구하기
		// getParent() : 경로만 구하기
		
		for(File f:list) {
			if (f.isDirectory()) { // f가 폴더일때
				if(f.isHidden()) // 숨긴파일 or not
					System.out.println(f.getPath() + "[숨긴폴더]");
				else System.out.println(f.getPath() + "[폴더]");
			}else if (f.isFile()){ // f가 파일일때
				System.out.println(f.getPath() + "[숨긴폴더]");
			}else System.out.println(f.getPath() + "[폴더]");
			}
			
		
		// 현재 시스템의 드라이브 목록 구하기
		File[] drive= File.listRoots(); // 파일객체를 만들어 리턴해줌
		for(File f :drive) {
			System.out.println(f.getPath());
			}
		
		// 용량 확인
		long size = f2.length();
		System.out.println(f2.getName() + "파일의 크기 -> " + size);
		
		
		// 파일 삭제
		boolean r  = f3.delete();
		System.out.println("삭제여부 :" + r);
				
		}catch (IOException e) {
		e.printStackTrace();
		}
	}
		
		
		public static void main(String[] args) {
			new FileTest();

		}	

	}
