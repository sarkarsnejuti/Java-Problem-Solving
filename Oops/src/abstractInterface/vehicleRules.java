package abstractInterface;

//Interface (acts as a contract)
public interface vehicleRules {

	void start(); // Abstract method (no body)

	// Default method (Java 8+)
	default void stop() {
		System.out.println("Vehicle stopped (Default rule)");
	}

	// Static method
	static void fuleInfo() {
		System.out.println("All vehicle needs to fule or energey");
	}

}
