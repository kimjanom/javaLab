package operator02;

public class NolliOp {

	public static void main(String[] args) {
		/*
		 *  &&:논리합
		 *  ||:논리곱
		 *  !:부정
		 *  &, |:비트연산자(and,or)
		 */
		/*
		 * 논리합(&&)
		 * false&&false:false
		 * true&&false:false
		 * true&&true:false
		 * true&&true:true
		 */

		/*
		 * 논리곱(||)
		 * false || false: false
		 * true||false:true
		 * false||true:true
		 * true||true:true
		 */
		/*
		 * 부정
		 * !true:false
		 * !false:true
		 */
		
		boolean b1=(5<3) &&(2<3);// 논리합은 true &true일떄만 true이다
		System.out.println(b1);
		boolean b2=(5>3) || (2>3);//논리곱은 false |false 일떄만 false 이다
		System.out.println(b2);
		//비교 연산이 논리연산보다 우선쉬위가 높다
		int num1=100,num2=200;
		boolean b3=!(5<2);
		System.out.println(b3);
		
		System.out.println(num1>100 &&num2>100);
		System.out.println(num1-50>100 ||num2-100>200);
		
		b2=(5>3) &(2<3);
		System.out.println(b2);
		
		//단락회로평가
		//A &&B;가 false면 b를 수행안하고 false로 리턴
		//A&B 모두 수행하고 값을 리턴한다
		num1=10;
		int i=2;
		//boolean b4=((num1=num1+10)<10)&&((i=i+2)<10);
		boolean b4=((num1=num1+10)<10)&((i=i+2)<10);
		System.out.println(b4);
		System.out.println(num1);
		System.out.println(i);
		/*
		 * ||와|의 비교
		 */
		boolean b5= ((num1=num2+10)>10)|((i=i+2)<10);
		
	}/////////////main

}///////////class
