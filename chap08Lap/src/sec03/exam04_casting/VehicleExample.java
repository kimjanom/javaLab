package sec03.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=new Bus();//구현객체,자동형변환 업캐스팅
		vehicle.run();
		//vehicle.checkFare();//참조형 축소
		Bus bus=(Bus) vehicle;
		bus.run();
		bus.checkFare();
	}

}
