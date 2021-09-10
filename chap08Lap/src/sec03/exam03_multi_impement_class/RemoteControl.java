package sec03.exam03_multi_impement_class;

public interface RemoteControl {
	//인터페이스 구성요소
	//상수
	public static final int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	//추상메소드
	void turnOn();
	
	void turnOff();
	
	void setVolume(int volume);
	//디폴트메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음처리한다");
		}
		else {
			System.out.println("무음해제");
		}
	}
	//정적메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다");
	}
	

}
