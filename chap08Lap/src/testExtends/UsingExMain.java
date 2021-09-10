package testExtends;

public class UsingExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingEx exe=new UsingEx();
		try{
			System.out.println(exe.sub(5,2));
			System.out.println(exe.subs(5,3));
			System.out.println(exe.sub(5,0));
			}catch(MyZeroException ee){
			System.out.println(ee);
			}
	}

}
