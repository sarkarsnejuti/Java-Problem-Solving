package Abstraction;

public class carLoan extends Loan{
	//double amount;
	carLoan(double amount){
		super(amount);
	}
	double calculateInterest() {
		return amount * 0.10;
	}

}
