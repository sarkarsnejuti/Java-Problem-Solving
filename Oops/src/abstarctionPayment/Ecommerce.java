package abstarctionPayment;

public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment creditPay = new creditCardPayment();
		Order order1 = new ElectronicsOrder(101,68499.00,creditPay);
		order1.processOrder();
		
		Payment upiPay = new upiPayment();
		Order order2  = new GroceryOrder(102,78210.00,upiPay);
		order2.processOrder();
	}

}
