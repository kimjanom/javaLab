package sec03.exam03_multi_impement_class;
//���� �������̽� ���� Ŭ����
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
