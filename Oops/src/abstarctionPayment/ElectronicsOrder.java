package abstarctionPayment;

public class ElectronicsOrder extends Order{
	ElectronicsOrder(int orderId, double amount, Payment payment){
		super(orderId, amount, payment);
	}
	void calculateTotal() {
		amount = amount + (amount * 0.18);
		System.out.println("Electronic's total amount is:" + amount);
	}

}
