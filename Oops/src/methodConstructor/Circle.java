package methodConstructor;

public class Circle {
	int redius;
	
	Circle(int redius){
		this.redius = redius;
	}
	public void calculateArea() {
		System.out.println("area is: " +(3.14*(redius * redius)));
	}
	float calculateCircumference() {
		float circumference = (float) (2*3.14*redius);
		return circumference;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle cir1 = new Circle(10);
		Circle cir2 = new Circle(20);
		cir1.calculateArea();
		System.out.println("circumference is " +cir1.calculateCircumference());
		
		cir2.calculateArea();
		System.out.println("circumference is " +cir2.calculateCircumference());
	}

}