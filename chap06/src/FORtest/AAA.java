package FORtest;

public class AAA {
	int result=0;
	
	void Plus(int num, int count) {
		
		result+= num;
		num++;
		if(num>=count) {
			System.out.println("гу:"+result);
		}
		else {
			Plus(num,count);
		}
		
	}
}
