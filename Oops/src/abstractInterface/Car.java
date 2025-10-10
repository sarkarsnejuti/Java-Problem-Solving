package abstractInterface;

//Concrete Class — inherits abstract class + implements interface
public class Car extends Vehical implements vehicleRules{

	Car(String brand){
		super(brand);
	}

	@Override
	public void start() {
		System.out.println("Car started");
		
	}

	@Override
	void fullType() {
		System.out.println("Fule type: Petrol");
		
	}
}
