package sec04.exam_class_new;

//실행용
public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student(); //Student 객체를 만들어서 생성된 객체의 주소값을 s1 변수에 저장한다
		//s1는 Student 객체를 참조하니까 s1는 생선된 Student객체를 지칭한다
		System.out.println("s1 변수가 Student 객체를 참조합니다");
		
		Student s2= new Student();
		System.out.println("s2 변수가 또 다를 Studnet객체를 참조한다 ");
	}

}
