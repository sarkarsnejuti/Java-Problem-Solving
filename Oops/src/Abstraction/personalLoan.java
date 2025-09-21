package Abstraction;

public class personalLoan extends Loan{
	//double amount;
	personalLoan(double amount){
		super(amount);
	}
	double calculateInterest() {
		return amount * 0.19;
	}

}
