package com.compus;


public class Car {
	protected String brand = " 그랜져"; //protected는 패키지가 다르면 반드시 상속받아 사용!
	String color = "White";
	int maxSpeed = 180;
	//private int speed = 0;// 패키지가 다르기 때문에 SportsCar에서 변수 사용 x -> 최소 protected (or public)
	protected int speed = 0;
	
	
	//protected  Car() {
	public Car() {
		System.out.println("Car()생성자 메소드 실행됨 ..");
	}	
	
	protected void speedUp() {
		
		speed++;
		
		if(speed > maxSpeed) {
			speed = maxSpeed;
		}
	}
	
	public void speedDown() {
		speed--;
		if(speed <0) {
			speed =0;
		}
	}
	
}



