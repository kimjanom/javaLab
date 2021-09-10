package sec03.Exam01_name_implement_class;

//Television 구현 클래스
public class Audio implements RemoteControl {
	//필드
	private int volume;
	//생성자
	//메소드
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
			System.out.println("Audio를 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
			System.out.println("Audio off");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
			if (volume>RemoteControl.MAX_VOLUME) {
				this.volume=RemoteControl.MAX_VOLUME;
			}
			else if(volume<RemoteControl.MIN_VOLUME) {
				this.volume=RemoteControl.MIN_VOLUME;
			}
			else {
				this.volume=volume;
			}
			System.out.println("현재 볼륨은"+volume);
	}

}
