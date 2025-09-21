package Abstraction;

public abstract class Loan {
double amount;

Loan(double amount){
	this.amount = amount;
}
//abstract method(no method body) // Abstract method → must be implemented by all loan types
abstract double calculateInterest();

//Concrete method → common for all loans
void displayLoanDetails() {
	System.out.println("Loan amount:" + amount);
	System.out.println("Interest is:" +calculateInterest());
}
}
