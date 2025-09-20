package abstarctionPayment;

public class GroceryOrder extends Order{
	GroceryOrder(int orderId,double amount,Payment payment){
		super(orderId,amount,payment);
	}
	void calculateTotal() {
		amount = amount + (amount * 0.13);
		System.out.println("Grocery's total amount(with GST) is " + amount);
	}

}
