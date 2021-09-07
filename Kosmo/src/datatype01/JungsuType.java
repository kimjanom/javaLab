package datatype01;

public class JungsuType {
	public static void main(String[] args) {
		/*
		 * 원칙] 1. 큰자료형과 작은 자료형의 연산 결과는 큰 자료형을 따른다.
		 *      2. 같은 자료형끼리는 연산 결과는 같은 자료형이 된다.
		 *      예외]int형보다 작은 자료형(byte,short,char)들끼리 
		 *      연산결과는 int형이다. 즉 적용이 안된다.
		 */
		//규칙1] 기본 자료형중 수치형의 정수형의 대표 자료형은 int
		byte b1;//변수선언
		b1=127;
		System.out.println(b1);
		b1=(byte)128;
		
		System.out.println(b1);//[o]형변환. 예상치 못한 값이 저장됨.
		//규칙2]int형보다 작은 자료형(byte,short,char)들끼리 연산결과는 int형이다.
		System.out.println('가'>100);
		byte b2=20,b3=30;
		//byte b4=b2+b3;[x] //더하기 연산결과는 int형이다.
		int num1=b2+b3;
		System.out.println("num1:"+ num1);
		byte b4=(byte)(b2+b3);
		System.out.println("b4:"+b4);
		
		short s1=1000,s2=2000;
		//short s3=s1+s2;[x] //더하기 연산결과는 int형이다.
		num1 = s1+s2;
		short s3=(short)(s1+s2);
		System.out.println("s3:"+s3);
		/*
		규칙3]정수형에서 int형보다 작은 자료형들을  제외한
		       자료형들끼리(int,long)의 연산결과는 모두 원칙을 따른다.
		       즉 int형과 int형의 연산결과는 int형
		       long형과 long형의 연산결과는 long형
		       int형과 long형의 연산결과는 long형
		*/
		num1=1000;
		long ln1=2000;
		long ln2=num1+ln1;
		//규칙4]정수형 int형의 범위를 넘어가는 숫자는 
		//long형으로 숫자뒤에 l또는 L을 붙인다.
		/*
		 * 22억은 뒤에 반드시 l L을 붙인다.
		 */
		long ln3=2200000000L;
		System.out.println(ln3);
		
		//규칙5]숫자 앞에0(영)이 붙으면 8진수를 의미한다.
		int num2=0412;
		System.out.println("num2:"+num2);
		//규칙6]숫자 앞에0x(0X)가 붙으면 16진수를 의미
		num2=0x1F; //16+15=31
		System.out.println(num2);
		
		//2의보수(1의 보수 +1)
		int num3=0B00000000000000000000000000000101; //이진수 5
	  //int num4=0B10000000000000000000000000000101; //이진수 -5
		int num4=0B11111111111111111111111111111011; //1의 보수 +1 =2의보수(-5)
		
		int sum = num3+num4;
		System.out.println("num3:"+num3);
		System.out.println("num4:"+num4);
		System.out.println("sum:"+sum);
		
		//정수 2100000000+2100000000
		int n1=2100000000;
		int n2=2100000000;
		int n3=n1+n2;
		
		System.out.println(n3);// 오버플로우가 발생해서 원하지 않는값이 나옴
		//long n4=n1+n2;[x] //정수형 + 정수형 = 정수형의 결과값이 long형에 담김
		long n4=n1+(long)n2;
		System.out.println(n4);
		//과제
		//1]국어,영어, 수학점수 및 점수 총합을 저장할 수 있는 변수 4개를 선언하여라(int형 사용)
        int kor,eng,math,total;
		//2]국어에는 89, 영어는 99, 수학은 78을 저장하여라
        kor=89;
        eng=99;
        math=78;
		//3]국영수의 총합을 구해서 1]번에서 선언한 총합 저장용 변수에 저장하여라
        total=89+99+78;
		//4]각 국영수 점수 및 총합을 출력하여라. 
        System.out.println("국어점수:"+kor);
        System.out.println("영어점수:"+eng);
        System.out.println("수학점수:"+math);
        System.out.println("총합:"+total);
        
        //String str="문자열";
        //System.out.println(str);
		
	}///main
}//////class
