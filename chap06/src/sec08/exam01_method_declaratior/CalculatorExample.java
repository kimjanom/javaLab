package sec08.exam01_method_declaratior;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc=new Calculator();
		myCalc.powerOn();
		int result1=myCalc.plus(5, 6);
		System.out.println("결과:"+result1);
		
		byte x=10;
		byte y=4;
		double result2=myCalc.divide(x,y);
		//자동형변환 :int(4) <- byte(1)
		//강제형변환:byte(1)<-int(4)
		//ex)int num=10;
		//byte i=(byte)num;
		System.out.println("result2 :"+result2);
		
		myCalc.powerOf();
		//
	}

}
