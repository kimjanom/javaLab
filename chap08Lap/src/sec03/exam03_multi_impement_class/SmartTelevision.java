package sec03.exam03_multi_impement_class;
//다중 인터페이스 구현 클래스
public class SmartTelevision implements RemoteControl, Searchable{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("turnon tv");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url+"ddd");
	}

}
