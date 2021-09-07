package ArrayEx;

public class ArrayEx05 {

	public static void main(String[] args) {
		int[][] guguDan= new int[8][9];
		
		for(int i=0;i<guguDan.length;i++) {
			System.out.println((i+2)+"단");
			for(int k=0;k<guguDan[i].length;k++) {
				guguDan[i][k]=(i+2)*(k+1);
				System.out.printf("%d * %d = %d%n" ,(i+2),(k+1),guguDan[i][k]);
			}
		}
		
		int dan=2;
		int num;
		System.out.println("향상된 for문을 사용");
		for(int[] i:guguDan) {
			System.out.println(dan+"단");
			num=1;
			for(int a:i) {
				System.out.printf("%d * %d = %d %n",dan,num,a);
				num ++;
			}///2nd for
			dan++;
		}///1st for
			
		
	}

}
