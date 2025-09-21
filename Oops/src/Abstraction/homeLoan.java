package Abstraction;

public class homeLoan extends Loan{
	//double amount;
	homeLoan(double amount){
		super(amount);
	}
	double calculateInterest() {
		return amount * 0.18;
	}

}
