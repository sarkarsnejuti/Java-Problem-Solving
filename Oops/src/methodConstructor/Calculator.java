
package methodConstructor;

public class Calculator {
	int a;
	int b;

	Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void sum() {
		System.out.println("Sum is " + (this.a + this.b));
	}

	void subtract() {
		System.out.println("subtract is " + (this.a * this.b));
	}

	void multification() {
		System.out.println("miltification is " + (this.a - this.b));
	}

	void division() {
		System.out.println("Division is " + (this.a / this.b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator(17, 5);
		cal.sum();
		cal.subtract();
		cal.multification();
		cal.division();
	}

}
