package sec03.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=new Bus();//������ü,�ڵ�����ȯ ��ĳ����
		vehicle.run();
		//vehicle.checkFare();//������ ���
		Bus bus=(Bus) vehicle;
		bus.run();
		bus.checkFare();
	}

}
