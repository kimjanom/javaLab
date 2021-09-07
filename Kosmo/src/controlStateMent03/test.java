package controlStateMent03;

import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		System.out.println("숫자을 입력하시오");
		char word;
		word=(char)System.in.read();
		if(word>=0&&word<=9) {
			System.out.println("숫자입니다");
		}
		else {
			System.out.println("숫자가 x");
		}
		
	}

}
