package chap08test04;

public class ActionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Action action=new Action() {
			public void work() {
				System.out.println("복사를 합니다");
			}
			
		};
		
		action.work();
	}

}
