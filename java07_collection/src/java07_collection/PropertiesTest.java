package java07_collection;

import java.awt.event.KeyListener;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public PropertiesTest() {
		//Properties : 키와 value가 String이여야 한다.
		
		Properties prop =new Properties();
		
		prop.setProperty("/","/index.jsp"); // 키값, value -> /로 접근하면 index.jsp  실행
		prop.setProperty("/boardList", "/board/boardList.jsp"); //boardList 접근하면, board/boardList.jsp 실행
		prop.setProperty("/member", "member/memberForm.jsp");
		prop.setProperty("/notice", "/notice/noticeView.jsp");
		
		String page = prop.getProperty("/notice");
		System.out.println("/notice-->" + page);
		
		Enumeration keyList = prop.propertyNames();
		
		while(keyList.hasMoreElements()) {
			String key = String()keyList.nextElement();
			String valueString = String prop.getProperty(key);
			System.out.println(key + "------>" + value );
		} 
		}
		
		
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PropertiesTest();
	}

}
