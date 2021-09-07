import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		//자바 교육 기관
		/*
		System.out.println("한국");
		System.out.println("소프트웨어");
		System.out.println("인재 개발원");
		*/
		Date today= new Date();
		//System.out.println(today);
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
		System.out.println(dateFormat.format(today));
		
	}

}