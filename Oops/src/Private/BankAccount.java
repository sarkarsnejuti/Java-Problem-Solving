package Private;

public class BankAccount {
 private double initialBalance;//private only access in the class
 private double amount;

 
 BankAccount(){
	 this.initialBalance = initialBalance;
	 this.amount = amount;
 }
 //using getter,setter for for other's access
  public double getInitialBalance() {
	  return initialBalance;
  }
  public void setInitialBalance(double initialBalance) {
	  this.initialBalance = initialBalance;
  }
  public double getDepositeAmount() {
	  return amount;
  }
  public void setDepositeAmount(double amount) {
	  if(amount > 0) {
		  System.out.println("Deposite amount is:" +amount);
		  initialBalance = initialBalance+amount;
		  System.out.println("Updated balance is:" +initialBalance);
	  }
	  else {
		  System.out.println("Invalid amount!, Please put the valid amount");
	  }
  }
  public double getWithdrawlAmount() {
	  return amount;
  }
  public void setWithdrawlAmount(double amount) {
	  if(amount > 0 && amount <= initialBalance) {
		  System.out.println("Withdrawl amount is:" +amount);
		  initialBalance = initialBalance-amount;
		  System.out.println("After withdrawl, avaliable balance is:" +initialBalance);
	  }
	  else
	  {
		  System.out.println("Invalid amount!!, Please put valid amount");
	  }
  }
}
