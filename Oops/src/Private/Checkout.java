package Private;

public class Checkout {
	private void validatingIteam(String item) {
		System.out.println("Validating item: " +item);
	}
	private double calculateTax(double price) {
		double tax = price * 0.18;
		System.out.println("Tax is: " +tax);
		return tax;
	}
	private double applyDiscount(double amount) {
		double discount = amount > 1000 ? 100 : 0;
		System.out.println("Discount applied " +discount);
		return amount - discount;
	}
	private void confirmPayment(double totalAmount, String paymentMethod) {
		System.out.println("Paid amount " +totalAmount +" Using " +paymentMethod);
	}
	
	public void processPayment(String item, double price, String paymentMethod) {
		System.out.println("Processing oder for: " +item);
		validatingIteam(item);
		double tax = calculateTax(price);
		double totalAmount = applyDiscount(price + tax);
		confirmPayment(totalAmount,paymentMethod);
		System.out.println("Order placed successfully!");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkout checkOutNew = new Checkout();
		checkOutNew.processPayment("Laptop",56000,"credit card");
	}

	}
