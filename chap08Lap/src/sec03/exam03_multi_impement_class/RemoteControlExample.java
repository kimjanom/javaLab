package sec03.exam03_multi_impement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTelevision tv= new SmartTelevision();
		
		
		RemoteControl rc= tv;//인터페이스 변수 =구현객체
		Searchable searchable=tv;//
	}

}
