package controlStateMent03;

import java.io.IOException;

public class ifStatement03 {

	public static void main(String[] args) throws IOException {
	/*
	 * if문 기본형식3]
	 * if(조건식){
	 * 조건1참 실행문
	 * }
	 * else if(조건식){
	 * 조건2참 실행문
	 * }
	 * else{
	 * 위조건 x시 실행문
	 * }
	 */
	int kor=99,eng=80,math=89;
	double avg=(kor+math+eng)/3.0;
	if(avg>=90) {
		System.out.println('A');
	}
	else if(avg>=80){
		System.out.println('B');
		
	}
	else if(avg>=70) {
		System.out.println('C');
	}
	else if(avg>=60) {
		System.out.println('D');
	}
	else {
		System.out.println("FFFFFFFFFFFFF");
		
		
	}
	System.out.println("1문자하나를 입력하세요");
	char word=(char)System.in.read();
	if(word>='0'&&word<='9') {
		if(word%2==0) {
			System.out.println("짝수입니다");
		}
		else if(word%2!=0) {
			System.out.println("홀수입니다");
		}
	}
	else if (word>='a'&&word<='z') {
		System.out.println("소문자");
	}
	else if(word>='A'&&word<='Z') {
		System.out.println("대문자");
	}
	else {
		System.out.println("not thing");
	}
	System.in.skip(2);
	for(int a=0;a<=100;++a) {
	System.out.println("2문자하나를 입력하세요");
	word=(char)System.in.read();
	if(word>='0'&&word<='9') {
		System.out.println("숫자");
	}
	else if ((word>='a'&&word<='z')||(word>='A'&&word<='Z')) {
		System.out.println("알파벳");
	}
	else {
		System.out.println("기타");
	}
	System.in.skip(2);
	}
	
	}/////main

}//////class
