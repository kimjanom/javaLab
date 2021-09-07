package sec07.exam03_constructer_overlading;

public class Car {
	//클래스 구성 멤버
	//1.필드
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	//2.생성자
	Car(){
		
	}
	
	Car (String model){
		this.model=model;
	}
	
	Car(String model, String color){
		this.model=model;/// this는 자기자신의 객체
		this.color=color;
	}
  Car(String model, String color,int maxSpeed){
	  this.model=model;
	  this.color=color;
	  this.maxSpeed=maxSpeed;
	}
	//3메소드

}
