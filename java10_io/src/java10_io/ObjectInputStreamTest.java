package java10_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {

	public ObjectInputStreamTest() {
		//파일에 저장된 Object 객체를 읽어오기(Input)
		
		try {
			File file = new File("c://javaFileTest", "object.txt");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			DataVO vo = (DataVO)ois.readObject();
			
			System.out.println(vo.getNum());
			System.out.println(vo.getName());
			System.out.println(vo.getDate());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
