package operator02;

public class BeeKyoOp {

	public static void main(String[] args) {
		/*
		 * 비교연산자(이항연산자)의 결과는 
		 * true or false(boolean값)
		 * > :~보다 크다
		 * >=:~보다 크거나 같다
		 * !=: ~과 다르다
		 * ==:~과 같다
		 * 비교연산자는 모두 우선 순위가 같다 
		 * 산술연산자가 비교 연산자보다 우선 순위가 높다
		 * 비교 연산자를 사용한 식은 비교식
		 */
		int num1=2, num2=3;
		System.out.println(num1<num2);
		System.out.println(num1!=num2);
		System.out.println(num1==num2);
		System.out.println((int)(num2-num1)==1.0);
		boolean b = !true||true^false&&true;
		System.out.println("b:"+b);
		System.out.println('A'==65);
	}/////main

}////////////////class
