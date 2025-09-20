package abstarctionPayment;

public class upiPayment implements Payment{
	@Override
	public void pay(double amount) {
		System.out.println("Paid" +amount+ "through upi");
	}
	@Override
	public void refund(double amount) {
		System.out.println("Refund" +amount+ "to upi");
	}

}
