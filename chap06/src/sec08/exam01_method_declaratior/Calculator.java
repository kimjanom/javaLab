package sec08.exam01_method_declaratior;

public class Calculator {
	//구성필드
	//1.필드
	//2.생성자
	//3.메소드
	void powerOn() {
		System.out.println("전원을 켭니다");
		
	}
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
		
		
	}
	double divide (int x,int y) {
		double result=(double )x / (double)y;
		return result;
	}
	void powerOf() {
		System.out.println("전원을 끕니다");
	}
}
