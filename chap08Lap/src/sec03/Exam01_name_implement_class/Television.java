package sec03.Exam01_name_implement_class;

//Television ���� Ŭ����
public class Television implements RemoteControl {
	//�ʵ�
	private int volume;
	//������
	//�޼ҵ�
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
			System.out.println("tv�� �մϴ�");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
			System.out.println("tv off");
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
			System.out.println("���� ������"+volume);
	}

}