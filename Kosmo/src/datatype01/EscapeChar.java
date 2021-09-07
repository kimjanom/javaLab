package datatype01;

public class EscapeChar {

	public static void main(String[] args) {
		/*
		 * Escape문자(\)
		 * 문자열 내에서 특수한 기능을 수행하는 문자(특수한 의미로 해석 되는 문자)
		 */
		//예]
		System.out.println("hit HomeRun");
		System.out.println("hit\t HomeRun");
		//1]\n:줄바꿈(line feed)기능
		System.out.println("Hit HomeRun");
		System.out.println("Hit \nHomeRun");
		System.out.println("\nHit HomeRun");
		//2]\r:커서를 해당 줄에서 맨 처음으로 이동(carrage return)
		System.out.println("My NickName is Superman\rxx");
		
		/*
		 * 키보드의 A라고 치면 65라는 값이 저장됨
		 * 키보드로 인터를 치면 13과 10이 저장됨
		 * 13은 \r의 아스키코드값
		 * 10은 \n의 아스키코드값
		 * 그러므로 엔터키는 \r\n이다
		 */
		//3]\t: 탭키 만큼 띄어 쓰기 기능
		System.out.println("국어t영어t수학");
		System.out.println("국어\t영어\t수학");
		
		//4]\':single quotation표시
		System.out.println("나의 닉네임은 '스마트보이' 입니다.");
		System.out.println("나의 닉네임은 \'스마트보이\' 입니다.");
		
		//5] \" : double quotation표시
		// "을 문자열의 시작/끝을 의미하는 문자가 아님을 컴파일러에게 알려줌(중요)
		System.out.println("나의 닉네임은 \"스마트보이\" 입니다.");
		
		//6]\\:뒤에 \은 이스케이프 문자 역할을 하는 
		//특수문자가 아니라는 것을
		//컴파일러에게
		// 알려주는 기능(중요)
		System.out.println("C:\nDrive\table");
		/*
		 C:
		 Drive	able
		 */
		System.out.println("C:\\nDrive\\table");
		/*
		 C:\nDrive\table
		 */
		
		
		/*
		 * Format  String:출력형식을 지정하기 위한 형식 문자열
		 * %s나 %d등의 변환 지시어(Conversion Specifier)를 
		 * 사용해서 원하는 출력 형식을 만들 수 있다.
		 * *변환지시어를 쓸 수 있는 메소드가 정해져 있다
		 * 
		 */
		/*주요 변환 지시어
		 * %d:정수값 출력시(byte/short/int/long)
		 * %f: 실수값 출력시(float/double)
		 * %c: 한문자 출력시(char)
		 * %b: boolean출력시
		 * %s: 문자열 출력시
		 * %n: 줄바꿈(\r\n도 가능)
		 * %%: %리터럴을 의미
		 */
		int kor=99,eng=80,math=96;
		//double avg=(kor+eng+math)/3.0;
		double avg=(double)(kor+eng+math)/3;
		System.out.println(avg);
		
		System.out.println("[형식 문자열 미사용]");
		System.out.println("국어:"+kor+",영어:"+eng+",수학:"+math+",평균:"+avg);
		
		System.out.println("[형식 문자열 사용]");
		System.out.printf("국어:%d,영어:%d,수학:%d,평균:%f%n",kor,eng,math,avg);
		System.out.printf("국어:%s,영어:%s,수학:%s,평균:%s%n",kor,eng,math,avg);
		
		System.out.printf("%c %b %.2f %s %%%n",'가',true,3.141592323,"문자열");
		System.out.printf("%s %s %s %s %%%n",'가',true,3.141592323,"문자열");
		/*
		 * 형식문자열에서 데이터 툴력시 자릿수 지정
		 * 예] %숫자d
		 * %4c : 한문자를 출력하는 데 전체 자리수는 4
		 * %5d:  정수 숫자를
		 * %6.2f%:실수를 출력하는데
		 *       소수점 둘째자리까지만 출력하고 전체 자리수는 6(소수점 포함)
		 *       
		 *  자릿수 지정시 값을 오른쪽부터 채운다(양수일때)
		 *  -를 붙이면 왼쪽부터 채운다
		 *  printf("%4d", 12);
		 *  --12
		 *  printf("%-4d", 12);
		 *  12--     
		 */
		System.out.println("=======================================");
		System.out.printf("%20s%n","자바성적표");
		System.out.println("=======================================");
		System.out.printf("%-10s%-12s%-10s%s%n","KOREA","ENGLISH","MATH","평균");
		System.out.println("=======================================");
		System.out.printf("%-10d%-12d%-10d%d%n",kor,eng,math,(kor+eng+math)/3);
		
		/*문제]
		 * 성적표를 계산 출력 하시요
		 * ?해당하는 부분은 실제 데이타를 계산해서 출력하여라
		 * 변수에 아래 각점수를 저장해서 사용해도 무방
		 * 단 평균은 소수점 둘째 자리까지만 출력하여라
		===========================================
		name kor eng math total avg
		===========================================
		HONG 95  70  90   ?    ??.??
		KIM  90  85  80   ?    ??.??
		PARK 85  98  97   ?    ??.??
		*/
		System.out.println("=========================================");
		System.out.printf("%22s%n","자바성적표");
		System.out.println("=========================================");
		System.out.printf("%-5s%-7s%-8s%-7s%-7s%-7s%n","name","kor","eng","math","total","avg");
		System.out.println("=========================================");
		System.out.printf("%-5s%-7d%-8d%-7d%-7d%.2f%n","HONG",95,70,90,95+70+90,(95+70+90)/3.0);
		System.out.printf("%-5s%-7d%-8d%-7d%-7d%.2f%n","KIM",90,85,80,90+85+80,(90+85+80)/3.0);
		System.out.printf("%-5s%-7d%-8d%-7d%-7d%.2f%n","PARK",85,98,97,85+98+97,(85+98+97)/3.0);
		
	}////main

}////////class
