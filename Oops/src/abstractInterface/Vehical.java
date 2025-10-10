package abstractInterface;

//Abstract Class (common base with some implementation)
public abstract class Vehical {
	String brand;

	Vehical(String brand) {
		this.brand = brand;
	}

// Concrete method (common to all)
	void displayBrand() {
		System.out.println("Brand: " + brand);
	}

// Abstract method (specific to each vehicle)
	abstract void fullType();

}
