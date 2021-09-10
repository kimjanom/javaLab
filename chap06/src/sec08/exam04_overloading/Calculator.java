package sec08.exam04_overloading;

public class Calculator {
	
	//정사각형 넓이
	double areaReactangle(double width) {
		return width*width;
	}
	//직사각형
	//method overloading(중복)
	double areaRectangle(double width, double height) {
		return width*height;
	}
}
