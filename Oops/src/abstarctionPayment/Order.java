package abstarctionPayment;

public abstract class Order {
int orderId;
double amount;
Payment payment;

Order(int orderId, double amount, Payment payment){
	this.orderId = orderId;
	this.amount = amount;
	this.payment = payment;
}
abstract void calculateTotal();

void processOrder() {
	calculateTotal();
	payment.pay(amount);
	System.out.println("Order" +orderId+ " processed sucessfully!");
	
}
}
