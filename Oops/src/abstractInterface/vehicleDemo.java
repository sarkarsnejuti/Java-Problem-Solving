package abstractInterface;

public class vehicleDemo {

	public static void main(String[] args) {
		Car car = new Car("BMW");
		car.displayBrand(); // from abstract class
		car.fullType();   // implemented abstract method
		car.start();      // from interface (abstract method)
		car.stop();       // from interface (default method)
		vehicleRules.fuleInfo(); //// static method from interface

	}

}
