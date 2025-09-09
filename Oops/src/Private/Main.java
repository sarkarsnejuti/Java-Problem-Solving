package Private;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount();
		ba.setInitialBalance(10000);
		System.out.println("Initial amount is: " +ba.getInitialBalance());
		ba.setDepositeAmount(5000);
		ba.getDepositeAmount();
		ba.setWithdrawlAmount(2000);
		ba.getWithdrawlAmount();
	}

}
