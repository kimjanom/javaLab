package sec07.exam04_other_construntor_call;

public class Car {
	//Ŭ���� ���� ���
	//1.�ʵ�
	String company="�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	//2.������
	Car(){
		
	}
	//������ �����ε�
	//this: �ڱ� �ڽ��� ��ü�� �ǹ��Ѵ�
	//this() :�ڱ� �ڽ��� ��ü�� �ٸ� �����ڸ� ȣǮ
	//super:�θ� ��ü
	//super():�θ� ��ü�� ������
	Car (String model){
		//this.model=model;
		this(model,null,0);
	}
	
	Car(String model, String color){
		//this.model=model;/// this�� �ڱ��ڽ��� ��ü
		//this.color=color;
		this(model,color,0);
	}
  Car(String model, String color,int maxSpeed){
	  this.model=model;
	  this.color=color;
	  this.maxSpeed=maxSpeed;
	}
	//3�޼ҵ�

}
