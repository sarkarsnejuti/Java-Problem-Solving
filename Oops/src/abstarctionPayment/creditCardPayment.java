package abstarctionPayment;

public class creditCardPayment implements Payment {
	 @Override
	public void pay(double amount) {
		System.out.println("Paid" +amount+ "through credit card");
	}
	 @Override
	public void refund(double amount) {
		System.out.println("Refund" +amount+ "to credit card");
	}

}
