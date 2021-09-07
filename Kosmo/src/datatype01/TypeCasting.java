package datatype01;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * 1] 묵시적 형변환:
		 *  작은 그릇의 데이터를 -> 큰그릇에 넣을때
		 *  =>형변환이 자동으로 일어 남
		 * 
		 * 2] 명시적 형변환
		 *  큰 그릇의 데이터를 -> 작은그릇에 넣을때
		 *  =>자료의 손실이 일어 날 수도 있다.
		 */
		byte b1=65;
		short s1;
		s1=65; //묵시적형변환
		System.out.println("b1:"+b1+",s1:"+s1);
		
		int num1=b1+s1; //묵시적형변환
		System.out.println(num1);
		
		char ch1=(char)b1;//명시적 형변환
		System.out.println(ch1);
		
		short s2=100;
		byte b2=(byte)s2;//명시적 형변환
		
		System.out.println("[데이타미손실]s2:"+s2 +",b2:"+b2);
		
		int num2=300;
		b2=(byte)300;
		
		System.out.println("[데이타손실]num2:"+num2+",b2:"+b2);
		
		double dl=3.14;
		int num3=(int)(num2+dl);
		System.out.println("[데이타손실]num3+dl:"+num3+",dl:"+dl);
		
	}////main

}///////class
