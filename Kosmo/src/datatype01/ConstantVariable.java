package datatype01;
/*
 * 상수:저장된 값이 절대 변하지 않는 메모리의 한 종류
 * 선언방법:final 자료형 변수명= 초기값;
 * 상수 선언후 중간에 값을 변경하면 에러
 * 변수명(상수명)은 보통 대문자로 선언한다.
 * 상수는 프로그램의 가독성을 높이며 유지 보수에도 유리하다.
 */

//클래스안에 선언된 변수 멤버변수, 상수라 한다.
//메서드안에 선언된 변수나 상수를 지역변수 혹은 지역상수라 한다.
public class ConstantVariable {
	//클래스안]
	//클래스안에서 상수를 선언할때는
	//반드시 선언과 동시에 초기화를 해야한다.
	//final double PI;[x]//초기화 안해서
	static final double PI=3.14; //[O] PI는 double상수
	static final int SCISSORS=1;
	static final int ROCK=2;
	static final int PAPER=3;
	
	public static void main(String[] args) {//메서드
		System.out.println(PI);
		//PI=3.141591234; //[x]
		
		/*메소드(즉 지역)안에서 상수를 선언할때느 초기화를 사용전에만 해주면 된다.
		 * 보통 메스드(지역)안에서는 상수 선언을 안함
		 * 주로 클래스안에서 상수 선언 함. 
		 */
		final String NICK_NAME;
		NICK_NAME="자바";
		System.out.println(NICK_NAME);
		
		//NICK_NAME="오라클";[x] //변경불가
		
		//가독성이 낮다
		int computer=1, user=2;
		
		//가독성이 높다.
		computer=SCISSORS;
		user=ROCK;
		
		System.out.println(computer);
		System.out.println(user);
	}//////main
	
	{
		//System.out.println(computer);[x] 지역변수(상수)는 지역안에서만 사용가능
	}

}/////////class
