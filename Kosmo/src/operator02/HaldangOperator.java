package operator02;

public class HaldangOperator {

	public static void main(String[] args) {
		/*
		 * [할당(대입)연산자]
		 * =;변수 = 값(변수)
		 * 오른쪽에 있는 값을 왼쪽에 변수에 할당(대입)한다.
		 * [복합대입연산자(축약표현)]
		 * +=, -=, *=, %=..등등
		 */
		//할당[대입]연산자
		int num1;//변수 선언
		num1=1000;
		//오른쪽 식이 항상 먼저 실행된 후에
		//결과값을 외쪽의 변수에 대입
		int num2=num1;
		num1 +=num1;
		System.out.println(num1);
		num1-=num1;
		//num1 &&=100;[x]복합ㅅ연산자는 산술연산자만 적용됨
		
		boolean b1=true,b2=false;
				System.out.println(b1&&b2);
				/*증감연산자(단항연산자)
				 * ++는 자기자신을 1증가
				 * --는 자기자신을 1감소
				 */
				int num3=10;
				num3++;
				System.out.println(num3);
				++num3; //전열연산자-항의 앞에 붙어있는 경우
				System.out.println(num3);
				
				//2]다른연산자와 함꼐 사용시 
				int num4=20;
				int result=num4+num3++;//후위연산자(연산후 대입한후 자신을 증가시킴
				System.out.println(result);
				result =num4 + ++num3;//전위연산자 (자신을 1증가한후에 연산을 수행)
				System.out.println(result);
				//전위연산>자신을 1증가(감소)한 후에 연산을 수행
				num3=10;
				result =num4+ --num3;
					System.out.println("reslt"+result);
					result =num4+ num3--;
					System.out.println("reslt"+result);
	}////////////////////////ㅡmain

}//////////////////class
