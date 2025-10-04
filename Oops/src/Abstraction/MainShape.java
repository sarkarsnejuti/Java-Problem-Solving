package Abstraction;

public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle(15);
		System.out.println("Area of Circle is : " +s1.area());
		Shape s2 = new Rectangle(15,20);
		System.out.println("Area of Rectangle is : " +s2.area());
		Shape s3 = new rightAngleTriangle(10,20,15);
		System.out.println("Area of Right Angle Triangle is : " +s3.area());

	}

}
