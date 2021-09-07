package sec06.exam01_freild_declaration;

public class carExample {

	public static void main(String[] args) {
		//객체 생성
		Car myCar= new Car();
		
		//필드를 접근하는 방법
		System.out.println("제작회사"+myCar.company);
		System.out.println("모델명"+myCar.medel);
		System.out.println("색깔"+myCar.color);
		System.out.println("최고속도"+myCar.maxSpeed);
		System.out.println("현재속도"+myCar.speed);
		
		//필드 변경
		myCar.speed=60;
		System.out.println("수정된 속도"+myCar.speed);;
	}

}
