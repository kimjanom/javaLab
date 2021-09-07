package controlStateMent03;

import java.io.IOException;

public class ifStatement01 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * if- 범위를 가지는 값
		 * 분기문(조건문):프로그램 흐름상 분기하고자 할때 사용하는 제어문
		 * if문switch문 두가지가 있다.
		 */
		   //if문 기본형식 1]
		/*
		 * 조건식은 비교식내지 논리식이어야한다
		 * 즉 결과값이 true아니면 false가 나오는 식이거나
		 * 직접 boolean(true,false)을 줄 수 있다
		 * 
		 * if(조건식){만약 (if) 조건식이 참이라면 (조건식,비교문)
		 * 	조건식이 참일때 실행할 명령문;
		 * }
		 * 
		 * 조건식이 참일때 실행할 명령문이 하나라면 
		 * {}이 가능하다
		 * {}는 실행문을 하나로 묶는 블락 역할을 한다
		 */
		
		int num=10;
		if(num%2==0) {
			System.out.printf("%d는 짝수 입니다%n",num);
		}
		
		else {
			System.out.printf("%d는 홀수 입니다%n",num);
		}
		//2]if(조건식); 는 조건식이 참일때 실행할 명령문이 없음을 의미(조심)
		
		//3]조건식이 참일때 수행할 명령문이 하나인 경우 {}는 생략가능
		System.out.println("1문자를 입력하세요");
		int ascii= (int)System.in.read();
		System.out.printf("사용자가 입력한 아스키 코드갑:%d",(int)ascii);
		//사용자가 입력한 문자가 숫자인지 문자인지 판단하자.
		
		
		boolean isNumber=ascii>=48 && ascii<=57;
		if(isNumber) {
			System.out.println("입력한 문자는 숫자입니다");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다");
		}
		
		System.out.println("2문자를 입력하시오");
		 char word=(char)System.in.read();
		 System.out.println("입력한 문자"+(int)word);
		 System.out.println("3문자를 입력하시오");
		word=(char)System.in.read();
		System.out.println("입력한 문자"+(int)word);
		 
	}////////////////main
 
}//////////////class
