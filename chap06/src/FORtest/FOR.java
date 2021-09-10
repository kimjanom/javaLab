package FORtest;

public class FOR {
	int result=0;
	int ForPlus(int num,int count) {
		int rootnum=num;
		 result = num+result;
		num++;
		if(num>=count) {
			System.out.printf("%d 부터 %d 까지 더하기 완료 ",rootnum,count);
			return result;
		}
		else {
			 ForPlus(num,count);
			
			
		}
		
	}
}
