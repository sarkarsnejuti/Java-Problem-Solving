package Abstraction;

public class LoanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan loan1 = new homeLoan(80000);
		loan1.displayLoanDetails();
		Loan loan2 = new carLoan(75000);
		loan2.displayLoanDetails();
		Loan loan3 = new personalLoan(69000);
		loan3.displayLoanDetails();
	}

}
