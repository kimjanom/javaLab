package operator02;

public class SansunOperator {

	public static void main(String[] args) {
		/*
		 * 산술연산자(이한연산자)의 결과는 다양하다
		 * 산술연산자내 에서의 연산 우선순위
		 * (*,%,/) > (+,-)
		 * 우선 순위가 같은 경우 왼쪽에서 오른쪽으로 연산한다
		 * 산술 연산자를 써서 식을 만들면 산술식
		 */
			
		int num1=3;
		int num2=5;
		System.out.println(num1+num2);
		System.out.printf("더하기%d%n",num1+num2);
		System.out.printf("뺴기%d%n",num1-num2);
		System.out.printf("곱하기%d%n",num1*num2);
		System.out.printf("나누기%d%n",num1/num2);
		System.out.printf("나머지%d%n",num1%num2);
		
		short s=100;
		//short s1=-s; [x] 숏에 연산자가 들어가서 인트형으로 바뀜
		int s1=-s;//단항연산자
		System.out.println(s1);
		int num3=s1+s;//이항연산자
		num3=(s>num1)? 1:0;//삼항연산자
		System.out.println(num3);
		/*
		 * 1.단항,이항,삼항연산자순
		 * 2,산술,비교,논리,대입연산자순
		 * 3.단항,대입연산자를 제외한 모든연산자의 방향은 왼쪽에서 오른쪽이다.
		 * 4.복잡한 연삭식에는 괄호()를 사용해서 우선순위를 정해준다.
		 */
		int result=3*2+5%2-6/3*5;
		System.out.println(result);
	}/////////////////main

}///////////////////class
