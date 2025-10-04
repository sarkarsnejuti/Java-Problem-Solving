package Abstraction;

public class rightAngleTriangle extends Shape{
	double height;
	double base;
	double hypotenuse;
	
	rightAngleTriangle(double height,double base,double hypotenuse){
		this.height = height;
		this.base = base;
		this.hypotenuse = hypotenuse;
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return (height * base)/2;
	}
	

}
