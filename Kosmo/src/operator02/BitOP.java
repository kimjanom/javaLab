package operator02;

public class BitOP {

	public static void main(String[] args) {
		/*비트연산은 비트단위로
		 * 논리합
		 * 0&0:0
		 * 0&1:0
		 * 1&0:0
		 * 1&1:1
		 * 논리곱
		 * 0|0:0
		 * 1|0:1
		 * 0|1:1
		 * 1|1:1
		 * 
		 * [쉬프트(shift) 연산자(이항연산자)]
		 * -두 항이 반드시 정수여야한다.
		 * 정수 <<비트수 :왼쪽으로 비트수만큼 이동하고 
		 * 						오른쪽에 남은 비트는 0으로 채운다
		 * 
		 * 정수>>>비트수:오른쪽으로 비트수만큼 이동하고 
		 * 							왼쪽에 남은 부호비트로채운다(1:음수,0양수)
		 * 
		 * 
		 */
			byte num1=45;
			byte num2=25;
			//byte result =num1&num2;[x] //연산의 결과가 정수라서
			int result=num1&num2;
			System.out.println(result);
			 result=num1|num2;
			
			 System.out.println(result);
			 
			 byte b1=10,bit1=2;
			 int result2 =b1 <<bit1;
			 System.out.println(result2);
			 b1=-9;
			 result=b1>>bit1;
			 System.out.println(result);
			 
			
			
					
					

	}////main 

}////class
