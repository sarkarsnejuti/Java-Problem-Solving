package Abstraction;

public abstract class Bank {
	
	//abstarct method
	abstract double calculateInterest(double amount);
	
	public void bankName(String name) {
		System.out.println("Bank name is: "  +name);
	}

}
