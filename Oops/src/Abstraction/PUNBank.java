package Abstraction;

public class PUNBank extends Bank{
	
	double calculateInterest(double amount) {
		return amount * 0.07;
	}

}
