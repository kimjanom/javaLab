package datatype01;

public class VariableDeclaration {//class 시작

	public static void main(String[] args) 
	{//main 시작
		System.out.println("[변수 선언 방법 첫 번째]");
		//자료형(data type)변수명
		int num; //int형(숫자-정수) 저장할 수 있는 num이라는 
		         //이름의 메모리를 할당해주세요.
		num=10;//변수 초기화
		int bNum = 0B1010; //2진수
		int oNum = 012; //8진수
		int hNum = 0xA; //16진수
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
		
		System.out.println("[변수 선언 방법 두 번째]");
		int initNum = 200; //선언과 동시에 초기화
		
		System.out.println(initNum);
		
		System.out.println("[변수 선언 방법 세 번째]");
		int fnum, snum=300, tnum; //동시에 같은 타입의 변수 여러개 선언하기
		
		//System.out.println(fnum);[x] //초기화 안되서
		fnum=snum;
		System.out.println(fnum);
		
		//fnum = snum+tnum;[x] //tnum 초기화안되서
		tnum = 500;
		System.out.println(snum+tnum);
		
		//항상 =(대입(할당)연산사)의 왼쪽에는
		//값을 변경할 수 있는 변수가 와야한다.
		//오른쪽에는 값이나 저장된 변수가 온다.
		
		int fNum;//자바는 대소문자를 엄격히 구분함.
		//studentName //카멜규칙
		//2]명명 규칙에 어긋나는 경우
		//2-1]숫자로 시작하는 경우
		//2-2]_나 $를 제외한 특수문자 포함시
		//2-3] 예약어를 사용하는 경우
		
		int y4ou, you4; //4you [x]
		int _uderbar,under_bar, underbar_;
		int $dollor, doll$or, dollor$;
		//int #sharp, sharp#; [x]
		//int public, void; static; [x]//예약어 사용 불가
		int puBlic,sTatic; //[o]
		
	}//main 끝

}//class 끝
