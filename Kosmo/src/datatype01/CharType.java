package datatype01;

public class CharType {

	public static void main(String[] args) {
		/*
		 * 아스키 코드 1btyte로 표현할 수 있는 문자
		 * (영문자 와 숫자,특수문자)
		 * 십진수의 정의한 값을 아스키 코드라함.
		 * 예]A의 아스키 코드값:65(이진수 : 1000001)
		 * 
		 * 키보드에서 A라고 치면 컴퓨터 메모리에
		 * 1000001로 저장됨
		 * 소문자 a는 아스키 코드값이 97
		 * 
		 * 유니코드 : 1Byte로 표현이 안되는 문자
		 * (한글이나 한자등)은 2Byte가 필요하다. 
		 * \\u16진수로 정의한 값을 유니코드라고 한다.
		 */
		char c1='A',c2=65,c3=0B1000001;//자료형 변수명=값
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4='가';
		char c5='나';
		System.out.println((int)c4);
		System.out.println(c5);
		
		//char형:하나의 문자를 저장할 수 있는 
		// 자료형(2byte), 0부터~ 2^16-1까지 저장
		// 값 저장시 하나의 문자를 ''(single quotation)으로 감싼다.
		//char c6=-30;[x] 음수라서 안됨
		//char c7="가";[x]//"가" 문자열(String)
		
		char ch1 ='A';
		int num1=2;
		System.out.println(ch1+num1);//인코딩된 숫자 값이 더해져서 출력됨
		System.out.println((char)(ch1+num1));
		
		//아스키(혹은 유니)코드값(십진수)을 char형으로 형변환하며
		//해당 아스키(혹은 유니)코드값에 일치하는 문자로 바꾼다.
		//반대로 어떤문자를 int형으로 형변환하면 그문자의 코드값(아스키 혹은 유니코드)을
		//알 수있다
		
		System.out.println((int)'가');
		System.out.println((int)'A');
		System.out.println((char)44032);
		System.out.println((char)44033);
		
		
	}///main

}/////class
