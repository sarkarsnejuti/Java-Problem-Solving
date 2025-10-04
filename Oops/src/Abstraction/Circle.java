package Abstraction;

public class Circle extends Shape{
 double radius;
 Circle (double radius){
	 this.radius = radius;
 }

@Override
double area() {
	// TODO Auto-generated method stub
	return 3.14 * radius * radius;
}
}
