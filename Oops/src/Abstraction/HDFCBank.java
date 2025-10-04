package Abstraction;

public class HDFCBank extends Bank{
	@Override
	double calculateInterest(double amount) {
		// TODO Auto-generated method stub
		return amount * 0.09;
	}

}
