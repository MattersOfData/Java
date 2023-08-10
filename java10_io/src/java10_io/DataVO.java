package java10_io;

import java.io.Serializable;
import java.util.Calendar;

//직렬화 시킴
public class DataVO implements Serializable {
	private int num = 9999;
	private String name = "손흥민";
	private Calendar date;
	public DataVO() {}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}


}