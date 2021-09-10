package sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc=new Calculator();
		//정사각형
		double result1=myCalc.areaReactangle(10);
		//직사각형
		double result2=myCalc.areaRectangle(10, 20);
		System.out.println("1"+result1 +"2"+result2);
		
	}

}
