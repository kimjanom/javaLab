package sec03.exam03_multi_impement_class;

public interface RemoteControl {
	//�������̽� �������
	//���
	public static final int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	//�߻�޼ҵ�
	void turnOn();
	
	void turnOff();
	
	void setVolume(int volume);
	//����Ʈ�޼ҵ�
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("����ó���Ѵ�");
		}
		else {
			System.out.println("��������");
		}
	}
	//�����޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�");
	}
	

}
