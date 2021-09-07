package datatype01;

import java.math.BigDecimal;

public class SilsuType {

	public static void main(String[] args) {
		//부동소수점방식 : 가수부 , 지수부
		//규칙1]정수형보다는 실수형이 더 큰 그릇이다.
		long ln=100;
		float fl=200;
		//fl = ln;
		//System.out.println(fl);
		//long ln1=ln+fl;//[x]long형과 float형 연산결과는 float
		float f2=ln+fl;
		System.out.println(f2);
		
		/*규칙2]실수형에서 기본 데이타 타입은 double이다
		소수점이 붙으면 무조건 double형으로 인식
		단, 소수점이 붙지 않은 값은 float에 담을 수 있다 */
		
		//방법1]형변환
		float f3=(float)3.14;
		
		//방법2]실수 숫자뒤에 f나F를 붙인다.
		f3=3.14f;
		
		System.out.println("f3:"+f3);
		
		double d1=3.14;//실수형에서 기본 데이타 타입은 double이다
		
		/*
		  규칙3] 실수형도 같은 자료형끼리의 연산결과는 
		        같은 자료형, 큰자료형과 작은 자료형과의
		        연산결과는 큰 자료형.
		*/
		float f4=300,f5=500,f6;
		f6=f4+f5;
		
		double d2= f6;
		
		double d3=10.0;
		d2=d3+f6;
		System.out.println(d2);
				
		/* 문]
		   반지름이 10인 원의 면적을 구해라
		   단 면적을 저장하는 변수의 타입을 3가지 형태(int/float/double)의
		   자료형에 저장하고 출력하여라 그리고 소수점을 제거하여라
		   원의 면적:반지름*반지름*3.14
		   단, 아래의 변수 radius와 pi를 사용해서 구해라
		 */
		int radius=10;
		double pi=3.14;
		int iarea;
		float farea;
		double darea;
		
		iarea=(int)(radius*radius*pi);
		farea=radius*radius*(float)pi;
		darea=radius*radius*pi;
		
		System.out.println("iarea:"+iarea);
		System.out.println("farea:"+farea);
		System.out.println("darea:"+darea);
		
		// 부동소수 방식 연산오류(지수로 표현되는 값이 0을 나타 낼 수 없다.)
		double d4=0.1;
		double d5=0.2;
		System.out.println(d4+d5); //예상:0.3, 실제:0.30000000000000004
		System.out.println(d4*d5); //예상:0.02, 실제:0.020000000000000004
		
		BigDecimal big1 = new BigDecimal("0.1");
		BigDecimal big2 = new BigDecimal("0.2");
		BigDecimal big3 = big1.add(big2);
		
		System.out.println(big3);
		/*
		 * BigDecimal타입1.compareTo(BigDecimal타입2)
		 * 값이 같으면 0
		 * BigDecimal타입1 가리키는 값이 더 크면 1
		 * BigDecimal타입1 가리키는 값이 더 작으면 -1
		 */
		System.out.println(big3.compareTo(new BigDecimal("0.3"))==0);
		
	}/////main

}/////////class
