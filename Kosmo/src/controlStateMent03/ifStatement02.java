package controlStateMent03;

import java.io.IOException;

public class ifStatement02 {

	public static void main(String[] args) throws IOException {
		/*
		 * if문 기본형식2]
		 * if(조건식){
		 * 조건식이 참이면 실해할 명령문;
		 * }
		 * else{
		 * 		조건식이 거짓일때 실행할 명련문;
		 * }
		 */
		
		int num1=98;
		if(num1%2==0) {
			System.out.println('짝');
		}
		else {
			System.out.println('홀');
		}///////1st if
		/*
		 * -삼항연산자
		 * if~else문과 같다
		 * 코드를 짧게 표현할때 주로 사용
		 * 변수=조건식?참일때:거짓일때 ;
		 */
		System.out.println("짝홀수 판단후 짝수일 경우 100이상인지 판다 if~ else사용");
		if(num1%2==0) {
			if(num1>=100) {
				System.out.println("짝수이면서 100이상 입니다");
			}
			else {
				System.out.println("짝수이지만 100이상은 아닙니다");
			}
		}
		else {
			System.out.println("짝수가 아닙니다");
		}
		
		System.out.println("숫자을 입력하시오");
		char word;
		word=(char)System.in.read();
		if(word>='0'&&word<='9') {
			System.out.println("숫자입니다");
		}
		else {
			System.out.println("숫자가 x");
		}
		System.out.println("삼항연산자이용");
		String test=(word>='0'&&word<='9')? "숫자0":"숫자x";
		System.out.println(test);
		
	}

}
