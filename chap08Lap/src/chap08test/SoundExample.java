package chap08test;

public class SoundExample {
	private static void printSound( Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soundable a=new Cat();
		Soundable b=new Dog();
		printSound(a);
		printSound(b);
	}

}
